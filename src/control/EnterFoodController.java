package control;

import static java.lang.Double.parseDouble;

import control.commands.AddFoodCommand;
import control.commands.ColorCommand;
import control.commands.MonoCommand;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;
import javax.swing.border.TitledBorder;
import model.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class EnterFoodController implements Initializable {
    private JSONArray jUsers = new JSONArray();
    private JSONObject jUser = new JSONObject();
    
    @FXML
    private TextField enterDateField;
    @FXML
    private TextField enterTimeField;
    @FXML
    private TextField enterFoodField;
    @FXML
    private TextField enterFoodAmountField;

    /**
     * Initializes the controller class.
     * @param url The location to resolve relative paths of resources.
     * @param rb The resources to be used by this controller.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    // handler for the 'back' button
    public void handleBack(ActionEvent event) throws IOException{
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Nav.fxml")));
    }
    
    // handler for the 'next' button
    public void handleNext(ActionEvent event) throws IOException{
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/EnterMood.fxml")));
    }
    
    public void handleSave(ActionEvent event) throws IOException{
        try{
            new AddFoodCommand(enterDateField.getText() + " " + enterTimeField.getText(),
                    enterFoodField.getText(), parseDouble(enterFoodAmountField.getText())).execute();
            Alert alert = new Alert(AlertType.INFORMATION, "Information");
            alert.setContentText("Food added");
            alert.showAndWait();

            app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/EnterFood.fxml")));
            createJFood(app.currentUser.getUsername(), enterDateField.getText() + " " + enterTimeField.getText(),
                    enterFoodField.getText(), parseDouble(enterFoodAmountField.getText()) );
            foodDataFileBuilder(app.currentUser.getUsername());
        } catch(java.lang.NumberFormatException e){
            new Alert(AlertType.ERROR, "Please enter a valid number").showAndWait();
        } catch (ParseException ex) {
            new Alert(AlertType.ERROR, "Invalid date/time format").showAndWait();
        } 
    }
    
    
    /**
     * Handles the color button by choosing a color background.
     * @param event The button click event.
     */
    @FXML
    public void handleColor(ActionEvent event) {
        new ColorCommand().execute();
    }
    
    /**
     * Handles the mono button by choosing a monochrome background.
     * @param event The button click event.
     */
    @FXML
    public void handleMono(ActionEvent event) {
        new MonoCommand().execute();
    }
    
    public void createJFood(String username, String date, String food, double quantity){
        jUser.put("Username", username);
        jUser.put("Date", date);
        jUser.put("Food", food);
        jUser.put("Quantity", quantity);
        jUsers.add(jUser);
    }
    
    public void foodDataFileBuilder(String s)  {           
        try{                
            String fileName = "./"+s+"FoodMood.txt";
            File file = new File(fileName);
            
            app.write(jUsers.toJSONString(), file);
        }
        catch(FileNotFoundException ex){
            //System.out.println(ex.toString());
        }catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
}
