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

import model.User;
import model.UserList;
import java.io.FileInputStream;
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

public class RegisterController implements Initializable {
    
    private User user;
    private UserList userList;
    
    
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
    
    public User createUser(String newName, String newUserName, String newPassword){
        user = new User(newName, newUserName, newPassword);
        return user;
    }
    
    @FXML
    private void handleSave(ActionEvent event) throws IOException {
        user = createUser(nameField.getText(), usernameField2.getText(), passwordField2.getText());
        userList = new UserList();
        if(userList.addUser(user) == true){
            
        }

    }
    
}
