package control;

import static java.lang.Double.parseDouble;

import control.commands.AddFoodCommand;
import control.commands.ColorCommand;
import control.commands.MonoCommand;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EnterFoodController implements Initializable {
    @FXML
    private Label enterFoodLabel;
    @FXML
    private Label enterAmountLabel;
    @FXML
    private TextField enterFoodField;
    @FXML
    private TextField enterFoodAmountField;
    @FXML
    private Label attentionLabel;
    @FXML
    private DatePicker dp;
    //@FXML
    //private Label showDateLabel;

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
        try{
            new AddFoodCommand(enterFoodField.getText(), parseDouble(enterFoodAmountField.getText())).execute();
            Alert alert = new Alert(AlertType.INFORMATION, "Information");
            alert.setContentText("Food added");
            alert.showAndWait();
            if (!alert.isShowing()) {//alert.getResult() == ButtonType.OK) {
                handleBack(event);
            }
        } catch(java.lang.NumberFormatException e){
            //Alert alert = new Alert(AlertType.ERROR, "Invalid number");
            //alert.setContentText("Please enter a valid number.");
            //alert.showAndWait();
            new Alert(AlertType.ERROR, "Please enter a valid number").showAndWait();
        }
    }
    
    // handler for the calendar button
    public void pickDate(ActionEvent event){
        try{
            //LocalDate ld = dp.getValue();
            //showDateLabel.setText(ld.toString());
            //app.currentUser.getFoodsEaten().addDate(ld);
        }
        catch(java.lang.NullPointerException exception){
            System.err.println("nullpointerexception here");
            //System.err.println("perhaps it's showdatelabel?");
            //System.err.println(showDateLabel);
            //System.err.println(fh);
            System.err.println(exception.getCause());
        }
        catch (Throwable exception)
        {
             //Catch other Throwables.
            System.err.println("other exception");
            System.out.println(exception.getCause());
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