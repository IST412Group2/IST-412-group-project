package control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;

public class app extends Application {
    public static Scene scene; // primary scene for switching between controllers
    public static User currentUser;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        this.scene = new Scene(root);
        stage.setTitle("Food Mood");
        stage.setScene(scene);
        scene.getStylesheets().add(app.class.getResource("/view/background.css").toExternalForm());
        stage.setWidth(600);
        stage.setHeight(450);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

// this is some demonstration changaesasdfasdf