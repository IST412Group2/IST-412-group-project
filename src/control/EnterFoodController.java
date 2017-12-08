package control;

import static java.lang.Double.parseDouble;

import control.commands.AddFoodCommand;
import control.commands.ColorCommand;
import control.commands.MonoCommand;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
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

public class EnterFoodController implements Initializable {
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
}
