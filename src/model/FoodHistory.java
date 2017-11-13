package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FoodHistory {
    private ObservableList<Food> listOfFoods;
    private ArrayList<LocalDate> listOfDatesEaten;
    
    public FoodHistory() {
        listOfFoods = FXCollections.observableArrayList();
        listOfDatesEaten = new ArrayList<LocalDate>();
    }
    
    public ObservableList<Food> addFood(Food food) {
        listOfFoods.add(food);
        return listOfFoods;
    }
     public ArrayList<LocalDate> addDate(LocalDate date) {
        listOfDatesEaten.add(date);
        return listOfDatesEaten;
    }
    
    /**
     * @return the listOfFoods
     */
    public ObservableList<Food> getListOfFoods() {
        return listOfFoods;
    }

    /**
     * @param listOfFoods the listOfFoods to set
     */
    public void setListOfFoods(ObservableList<Food> listOfFoods) {
        this.listOfFoods = listOfFoods;
    }

    /**
     * @return the listOfDatesEaten
     */
    public ArrayList<LocalDate> getListOfDatesEaten() {
        return listOfDatesEaten;
    }

    /**
     * @param listOfDatesEaten the listOfDatesEaten to set
     */
    public void setListOfDatesEaten(ArrayList<LocalDate> listOfDatesEaten) {
        this.listOfDatesEaten = listOfDatesEaten;
    }
    
    public String toString() {
        String ret = "";
        Iterator<Food> iter = listOfFoods.iterator();
        while(iter.hasNext()) {
            ret += iter.next() + "\n";
        }
        return ret;
    }
}