package control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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
    
    private static void persistData() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream("./userlist.ser");
            out = new ObjectOutputStream(fos);
            out.writeObject(listOfUsers);
            out.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void readUsers() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream("./userlist.ser");
            in = new ObjectInputStream(fis);
            listOfUsers = (UserList)in.readObject();
            in.close();
            if (listOfUsers == null) {
                System.err.println("Read error!");
                listOfUsers = new UserList();
            } else if(!listOfUsers.getUsers().isEmpty()){
                 System.out.println("There are users in the user list");
            }
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

//Matt's change
