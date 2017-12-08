package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.User;
import model.UserList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LoginController implements Initializable {
    //private final HashMap<String, String> users = new HashMap<>();
    private UserList userList;

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label failedLabel;

    /**
     * Initializes the controller class.
     * @param url The location to resolve relative paths of resources.
     * @param rb The resources to be used by this controller.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userList = new UserList();
    }    

    /**
     * Handles the login button by authenticating the user against a list of
     * test users.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        
        String fileName = "./"+usernameField.getText()+".txt";        
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader(fileName)){
            File userFile = new File(fileName);
            if(userFile.exists()){
                Object obj = jsonParser.parse(reader);
 
                JSONArray userList = (JSONArray) obj;             
                //Iterate over user array
                userList.forEach( us -> {
                    try {
                        parseUserObject( (JSONObject) us );
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } );
            }
            else{
                failedLabel.setVisible(true);
            }
        }
        catch (FileNotFoundException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Information");
            alert.setContentText("Username does not exist! Please enter a correct username or click 'Register new Account'.");
            alert.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    public void parseUserObject(JSONObject user) throws IOException
    {

        //Get user object within list
        //JSONObject userObject = (JSONObject) user.get("employee");
         
        String username = (String) user.get("Username");   
         
        String name = (String) user.get("Name");  
        
        String password = (String) user.get("Password");
        
        if(password.equals(passwordField.getText())){
            app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Nav.fxml")));
            
            app.currentUser = new User(name, username, password);
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Information");
            alert.setContentText("Username and password do not match!");
            alert.showAndWait();
        }  
    }
    
    @FXML
    public void presentRegisterAccount(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Register.fxml")));
    }
}
