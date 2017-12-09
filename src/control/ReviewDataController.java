package control;

import control.commands.ColorCommand;
import control.commands.MonoCommand;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Food;
import model.Mood;
import org.json.simple.JSONObject;

public class ReviewDataController implements Initializable {
    @FXML
    private TableView<Food> foodTable;
    @FXML 
    TableColumn colFoodDate;
    @FXML 
    TableColumn colFoodName;
    @FXML
    TableColumn colQuantity;
    @FXML
    private TableView<Mood> moodTable;
    @FXML 
    TableColumn colMoodDate;
    @FXML 
    TableColumn colMoodName;
    
    /**
     * Initializes the controller class.
     * @param url The location to resolve relative paths of resources.
     * @param rb The resources to be used by this controller.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //table = new TableView<Food>(app.currentUser.getFoodsEaten().getListOfFoods());
        foodTable.getItems().addAll(app.currentUser.getFoodsEaten().getListOfFoods());
        colFoodDate.setCellValueFactory(new PropertyValueFactory<Food,Date>("date"));
        colFoodName.setCellValueFactory(new PropertyValueFactory<Food,String>("name"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<Food,Double>("quantity"));
        moodTable.getItems().addAll(app.currentUser.getMoodsFelt().getListOfMoods());
        colMoodDate.setCellValueFactory(new PropertyValueFactory<Mood,Date>("date"));
        colMoodName.setCellValueFactory(new PropertyValueFactory<Mood,String>("name"));
    } 
    
    
    /**
     * Handles the Back button by loading the Nav view
     * and setting it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/EnterMood.fxml")));
    }
    
    @FXML
    public void handleMenu(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Nav.fxml")));
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
