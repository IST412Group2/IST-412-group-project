package control.commands;

import control.app;

public class ColorCommand {
    public void execute() {
        app.scene.getStylesheets().clear();
        app.scene.getStylesheets().add(app.class.getResource("/view/background.css").toExternalForm());
    }
}
