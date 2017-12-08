/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Matt
 */

import java.io.File;
import model.User;
import model.UserList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.util.Iterator;
import javafx.scene.control.Alert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class RegisterController implements Initializable {
    
    private User user;
    //private UserList userList;
    private JSONArray jUsers = new JSONArray();
    private JSONObject jUser = new JSONObject();
        
    @FXML
    private TextField nameField;
    @FXML
    private TextField usernameField2;
    @FXML
    private PasswordField passwordField2;
    @FXML
    private Label userExistsError;
    

    /**
     * Initializes the controller class.
     * @param url The location to resolve relative paths of resources.
     * @param rb The resources to be used by this controller.
     */
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
   
    
    
    public User createUser(String newName, String newUsername, String newPassword){
        user = new User(newName, newUsername, newPassword);
        return user;
    }
    
     public void createJUser(String name, String username, String password){
        jUser.put("Username", username);
        jUser.put("Name", name);
        jUser.put("Password", password);
        jUsers.add(jUser);
    }
     
    public boolean userDataFileBuilder(String s)  {        
        boolean fileCheck = true;    
        try{                
            String fileName = "./"+s+".txt";
            File file = new File(fileName);
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
    }
    
    @FXML
    private void handleSave(ActionEvent event) throws IOException {
        boolean check = true;
        createUser(nameField.getText(), usernameField2.getText(), passwordField2.getText());
        createJUser(nameField.getText(), usernameField2.getText(), passwordField2.getText());
        
        check = userDataFileBuilder(usernameField2.getText());
        //userNameCheck = userDataFileBuilder(usernameField2.getText());
        if(check == false){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Information");
            alert.setContentText("Username Already Taken!  Please choose a different username.");
            alert.showAndWait();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Information");
            alert.setContentText("Registration Success!  Click 'Back to Login' to login.");
            alert.showAndWait();
        }
    }
    
    @FXML
    private void handBacktoLogin(ActionEvent event) throws IOException{
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Login.fxml")));
    }
    
    
}