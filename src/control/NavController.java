package control;

import control.commands.ColorCommand;
import control.commands.MonoCommand;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class NavController implements Initializable {
//    @FXML
//    private Button newEntryButton;
//    @FXML
//    private Button existingDataButton;
//    @FXML
//    private Button settingsButton;
//    @FXML
//    private Button quitButton;
    /**
     * Initializes the controller class.
     * @param url The location to resolve relative paths of resources.
     * @param rb The resources to be used by this controller.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    /**
     * Handles the Make New Entry types nav button by loading the Enter Food view
     * and setting it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    public void presentEnterFood(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/EnterFood.fxml")));
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
    
    /**
     * Handles the Review Existing Data types nav button by loading the Data Correlation view
     * and setting it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    public void presentDataCorrelation(ActionEvent event) throws IOException {
        //FoodMood_M03_A04.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/DataCorrelation.fxml")));
    }
    
    /**
     * Handles the settings nav button by loading the settings view and setting
     * it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    public void presentSettings(ActionEvent event) throws IOException {
        //FoodMood_M03_A04.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Settings.fxml")));
    }

    /**
     * Handles the quit button by shutting down the JavaFX platform.
     * @param event The button click event.
     */
    @FXML
    public void handleQuit(ActionEvent event) {
        Platform.exit();
    }
}