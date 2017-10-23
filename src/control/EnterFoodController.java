package control;

import com.sun.javafx.binding.Logging;
import control.commands.AddFoodCommand;
import model.Food;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Double.parseDouble;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.Alert;
import java.util.Iterator;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;

public class EnterFoodController implements Initializable {
    private Food fd;
    //private FoodHistory fh;
    
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
            //FoodMood_M03_A04.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Mood.fxml")));
            //attentionLabel.setVisible(true);
            //double amount = parseDouble(enterAmountField.getText());
            //fd = new Food(enterFoodField.getText(), parseDouble(enterFoodAmountField.getText()));
            //app.currentUser.getFoodsEaten().addFood(fd);
            new AddFoodCommand(enterFoodField.getText(), parseDouble(enterFoodAmountField.getText())).execute();
            Alert alert = new Alert(AlertType.INFORMATION, "Information");
            alert.setHeaderText("Food added");
            alert.setContentText("Food added");
            alert.showAndWait();
            if (alert.getResult() == ButtonType.OK) {
                System.err.println("got here: alert button pressed");
                handleBack(event);
            }
        }
        catch(java.lang.NumberFormatException e){
            Alert alert = new Alert(AlertType.ERROR, "Invalid number");
            alert.setHeaderText("Invalid number");
            alert.setContentText("Please enter a valid number.");
            alert.showAndWait();
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
}
