package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MoodHistory {
    private ObservableList<Mood> listOfMoods;
    private ArrayList<LocalDate> listOfDatesFelt;
    
    public MoodHistory() {
        listOfMoods = FXCollections.observableArrayList();
        listOfDatesFelt = new ArrayList<LocalDate>();
    }
    
    public ObservableList<Mood> addMood(Mood mood) {
        listOfMoods.add(mood);
        return listOfMoods;
    }
     public ArrayList<LocalDate> addDate(LocalDate date) {
        listOfDatesFelt.add(date);
        return listOfDatesFelt;
    }
    
    /**
     * @return the listOfMoods
     */
    public ObservableList<Mood> getListOfMoods() {
        return listOfMoods;
    }

    /**
     * @param listOfMoods the listOfMoods to set
     */
    public void setListOfMoods(ObservableList<Mood> listOfMoods) {
        this.listOfMoods = listOfMoods;
    }

    /**
     * @return the listOfDatesFelt
     */
    public ArrayList<LocalDate> getListOfDatesFelt() {
        return listOfDatesFelt;
    }

    /**
     * @param listOfDatesFelt the listOfDatesFelt to set
     */
    public void setListOfDatesFelt(ArrayList<LocalDate> listOfDatesFelt) {
        this.listOfDatesFelt = listOfDatesFelt;
    }
    
    public String toString() {
        String ret = "";
        Iterator<Mood> iter = listOfMoods.iterator();
        while(iter.hasNext()) {
            ret += iter.next() + "\n";
        }
        return ret;
    }
}