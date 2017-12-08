package control.commands;

import control.app;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Mood;

public class AddMoodCommand {
    private Date date;
    private String moodName;
    
    public AddMoodCommand(String dateTime, String moodName) throws ParseException {
        this.date = new SimpleDateFormat("mm/dd/yy hh:ss").parse(dateTime);
        this.moodName = moodName;
    }
    
    public void execute() {
        Mood md = new Mood(moodName, date);
        app.currentUser.getMoodsFelt().addMood(md);
    }
}
