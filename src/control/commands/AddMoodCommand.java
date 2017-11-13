package control.commands;

import control.app;
import model.Mood;

public class AddMoodCommand {
    private String moodName;
    
    public AddMoodCommand(String moodName) {
        this.moodName = moodName;
    }
    
    public void execute() {
        Mood md = new Mood(moodName);
        app.currentUser.getMoodsFelt().addMood(md);
    }
}
