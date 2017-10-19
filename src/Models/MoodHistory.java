/* 
 * TODO
 * 
 * ADD DATE WHEN ADDING NEW MOOD
 *  - CONSIDER NEW DATA TYPE (HASHMAP ?)
*/

package Models;

import java.util.ArrayList;
import java.util.Date;

public class MoodHistory {
    private ArrayList<Mood> listOfMoods;
    private ArrayList<Date> listOfDatesFelt;
    
    public MoodHistory() {
        listOfMoods = new ArrayList<Mood>();
        listOfDatesFelt = new ArrayList<Date>();
    }

    public void addMood(Mood mood) {
        /*
         * CONSIDER CHANGING DATA TYPES
        */
        listOfMoods.add(mood);
        listOfDatesFelt.add(new Date());
    }
    
    public ArrayList<Mood> getMoods() {
        return listOfMoods;
    }
    public ArrayList<Date> getDatesFelt() {
        return listOfDatesFelt;
    }
}
