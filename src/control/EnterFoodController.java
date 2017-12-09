package control;

import static java.lang.Double.parseDouble;

import control.commands.AddFoodCommand;
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
            //if (!alert.isShowing()) {//alert.getResult() == ButtonType.OK) {
            //    handleBack(event);
            //}
            app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/EnterFood.fxml")));
            createJFood(app.currentUser.getUsername(), enterDateField.getText() + " " + enterTimeField.getText(),
                    enterFoodField.getText(), parseDouble(enterFoodAmountField.getText()) );
            foodDataFileBuilder(app.currentUser.getUsername().toString());
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
            foodParser(s);
            app.write(jUsers.toJSONString(), file);
        }
        catch(FileNotFoundException ex){
            //System.out.println(ex.toString());
        }
        catch(IOException ex){
            System.out.println(ex.toString());
        }
        
        
        
        //I was experimenting with this code
        /*String fileName = "./"+s+"FoodMood.txt";        
        File file = new File(fileName);
        try{
            app.write(jUsers.toJSONString(), file);
            Scanner input = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
            while(input.hasNextLine()){
                jsonIn.append(input.nextLine());
            }
            JSONParser parser = new JSONParser();
            JSONArray arrayFromFile = (JSONArray) parser.parse(jsonIn.toString());
            JSONArray tempArray = new JSONArray();
            for(int i=0; i<arrayFromFile.size();++i){
                JSONObject tempObj = (JSONObject) arrayFromFile.get(i);
                tempArray.add(tempObj);
            }
            app.write(tempArray.toString(), file);
                    
        } catch (FileNotFoundException ex) {
            //ex.printStackTrace();
        } catch (org.json.simple.parser.ParseException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
    }
    
    public void foodParser(String s){
        String fileName = s;        
        File file = new File(fileName);       
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader(fileName)){
            File userFile = new File(fileName);
            
            Object obj = jsonParser.parse(reader);
 
            JSONArray userList = (JSONArray) obj;             
            //Iterate over user array
            userList.forEach( us -> {
                try {
                    parseFoodObject( (JSONObject) us );
                    
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                } );
        }
        catch (FileNotFoundException e) {
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
         
        //I was experiementing with this code
        /*try{
            Scanner input = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
            while(input.hasNextLine()){
                jsonIn.append(input.nextLine());
            }
            JSONParser parser = new JSONParser();
            JSONArray arrayFromFile = (JSONArray) parser.parse(jsonIn.toString());
            JSONArray tempArray = new JSONArray();
            for(int i=0; i<arrayFromFile.size();++i){
                JSONObject tempObj = (JSONObject) arrayFromFile.get(i);
                tempArray.add(tempObj);
            }
            app.write(tempArray.toString(), file);
                    
        } catch (FileNotFoundException ex) {
            //ex.printStackTrace();
        } catch (org.json.simple.parser.ParseException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
        
    }
    
    public void parseFoodObject(JSONObject foodHist) throws IOException{
   

        //Get user object within list         
        String username = app.currentUser.getUsername().toString();
        
        String date = (String) foodHist.get("Date");   
         
        String food = (String) foodHist.get("Food");  
        
        double quantity = (double) foodHist.get("quantity");
        
        jUsers.add(jUser);
    }
}
