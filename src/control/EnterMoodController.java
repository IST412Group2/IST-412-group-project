package control;

import control.commands.AddMoodCommand;
import control.commands.ColorCommand;
import control.commands.MonoCommand;
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
import javafx.scene.control.TextField;
import model.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class EnterMoodController implements Initializable {
    private JSONArray jUsers = new JSONArray();
    private JSONObject jUser = new JSONObject();
    
    @FXML
    private TextField enterDateField;
    @FXML
    private TextField enterTimeField;
    @FXML
    private TextField enterMoodField;

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
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/EnterFood.fxml")));
    }
    public void handleMenu(ActionEvent event) throws IOException{
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Nav.fxml")));
    }
    
    // handler for the 'next' button
    public void handleNext(ActionEvent event) throws IOException{
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/ReviewData.fxml")));
        
    }
    
    public void handleSave(ActionEvent event) throws IOException{
        try {
            new AddMoodCommand(enterDateField.getText() + " " + enterTimeField.getText(), enterMoodField.getText()).execute();
            Alert alert = new Alert(AlertType.INFORMATION, "Information");
            alert.setContentText("Mood added");
            alert.showAndWait();
            //if (!alert.isShowing()) {//alert.getResult() == ButtonType.OK) {
            //    handleBack(event);
            //}
            app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/EnterMood.fxml")));
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
    
    /*public void appendJUser(String name, String username, String password, String fDate, String food, 
            double quantity, String mDate, String mood ){
        jUser.put("Username", username);
        jUser.put("Name", name);
        jUser.put("Password", password);
        jUser.put("Food Date", fDate);
        jUser.put("Food", food);
        jUser.put("Quantity", quantity);
        jUser.put("Mood Date", mDate);
        jUser.put("Mood", mood);
        
        jUsers.add(jUser);
    }
    
    public boolean moodFileBuilder() throws org.json.simple.parser.ParseException{
        boolean fileCheck = true;    
        try{    
            String s = "./"+app.currentUser.getUsername()+app.currentUser.toString().length()+"food.txt";
            File file = new File(s);
            if(file.exists()){
                fileCheck = false;
            }
            else{
                app.write(jUsers.toJSONString(), file);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.toString());
        }
        catch(IOException ex){
            System.out.println(ex.toString());
        }
        return fileCheck;
        
        
    }*/
}
