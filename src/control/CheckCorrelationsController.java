package control;

import control.commands.ColorCommand;
import control.commands.MonoCommand;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Food;
import model.Mood;

public class CheckCorrelationsController implements Initializable {
    @FXML
    private TableView<Food> foodTable;
    @FXML
    private TableView<Mood> moodTable;
    @FXML 
    TableColumn colFood;
    @FXML
    TableColumn colMood;
    
    /**
     * Initializes the controller class.
     * @param url The location to resolve relative paths of resources.
     * @param rb The resources to be used by this controller.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int i = app.currentUser.getFoodsEaten().getListOfFoods().size();
        int j = app.currentUser.getMoodsFelt().getListOfMoods().size();
        foodTable.getItems().addAll(app.currentUser.getFoodsEaten().getListOfFoods().get(i-1));
        colFood.setCellValueFactory(new PropertyValueFactory<Food,String>("name"));
        moodTable.getItems().addAll(app.currentUser.getMoodsFelt().getListOfMoods().get(i-1));
        colMood.setCellValueFactory(new PropertyValueFactory<Mood,String>("name"));
    }    
    
    
    /**
     * Handles the Back button by loading the Nav view
     * and setting it as the root scene node.
     * @param event The button click event.
     * @throws java.io.IOException
     */
    
    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        app.scene.setRoot(FXMLLoader.load(getClass().getResource("/view/Nav.fxml")));
    }
    
    /*@FXML
    public void handleCorrelate(ActionEvent event) throws IOException {
        int i = app.currentUser.getFoodsEaten().getListOfFoods().size();
        int j = app.currentUser.getMoodsFelt().getListOfMoods().size();
        ArrayList<String> corrArray = new ArrayList();
        corrArray.add(app.currentUser.getFoodsEaten().getListOfFoods().get(i-1).getName());
        corrArray.add(app.currentUser.getMoodsFelt().getListOfMoods().get(i-1).getName());
        foodTable.getItems().addAll(corrArray);
        colFood.setCellValueFactory(new PropertyValueFactory<ArrayList,String>("food"));
        colMood.setCellValueFactory(new PropertyValueFactory<Food,String>("mood"));
  
    }*/
    
    
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
