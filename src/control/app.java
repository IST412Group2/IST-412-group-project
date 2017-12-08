package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;
import model.UserList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class app extends Application {
    public static Scene scene; // primary scene for switching between controllers
    public static User currentUser;
    public static UserList listOfUsers;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        this.scene = new Scene(root);
        stage.setTitle("Food Mood");
        stage.setScene(scene);
        scene.getStylesheets().add(app.class.getResource("/view/background.css").toExternalForm());
        stage.setWidth(600);
        stage.setHeight(450);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //readUsers();
        launch(args);
    }
    
    public static void quit() {
        //persistData();
        Platform.exit();
    }
    
    public static void write(String s, File f) throws IOException{
        FileWriter fw = new FileWriter(f, true);
        fw.write(s);
        fw.close();
    }
}