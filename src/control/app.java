package control;

import model.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
