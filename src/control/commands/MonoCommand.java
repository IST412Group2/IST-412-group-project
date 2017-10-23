package control.commands;

import control.app;

public class MonoCommand {
    public void execute() {
        app.scene.getStylesheets().clear();
        app.scene.getStylesheets().add(app.class.getResource("/view/backgroundmono.css").toExternalForm());
    }
}
