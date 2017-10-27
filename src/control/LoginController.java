package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.UserList;

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
        app.currentUser = userList.authenticate(usernameField.getText(), passwordField.getText());
        if (app.currentUser != null){
            app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Nav.fxml")));
        } else {
            failedLabel.setVisible(true);
        }
    }
    
    @FXML
    public void presentRegisterAccount(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Register.fxml")));
    }
}
