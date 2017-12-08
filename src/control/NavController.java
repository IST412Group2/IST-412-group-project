package control;

import control.commands.ColorCommand;
import control.commands.MonoCommand;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class NavController implements Initializable {
    /**
     * Initializes the controller class.
     * @param url The location to resolve relative paths of resources.
     * @param rb The resources to be used by this controller.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    /**
     * Handles the Enter Food types nav button by loading the Enter Food view
     * and setting it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    public void presentEnterFood(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/EnterFood.fxml")));
    }
    
    /**
     * Handles the Enter Mood types nav button by loading the Enter Food view
     * and setting it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    public void presentEnterMood(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/EnterMood.fxml")));
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
     * Handles the Review Existing Data nav button by loading the Review Data view
     * and setting it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    public void presentReviewData(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/ReviewData.fxml")));
    }
    
    /**
     * Handles the Check Correlations nav button by loading the Data Correlation view
     * and setting it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    public void presentCheckCorrelations(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/CheckCorrelations.fxml")));
    }
    
    /**
     * Handles the Search nav button by loading the Search view and setting
     * it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    public void presentSearch(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Search.fxml")));
    }
    
    /**
     * Handles the quit button by shutting down the JavaFX platform.
     * @param event The button click event.
     */
    @FXML
    public void handleQuit(ActionEvent event) {
        app.quit();
    }
}