package model;

import java.io.Serializable;
import java.util.Iterator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FoodHistory implements Serializable{
    private ObservableList<Food> listOfFoods;
    //private ArrayList<LocalDate> listOfDatesEaten;
    
    public FoodHistory() {
        listOfFoods = FXCollections.observableArrayList();
        //listOfDatesEaten = new ArrayList<LocalDate>();
    }
    
    public ObservableList<Food> addFood(Food food) {
        listOfFoods.add(food);
        return listOfFoods;
    }
    //public ArrayList<LocalDate> addDate(LocalDate date) {
        //listOfDatesEaten.add(date);
        //return listOfDatesEaten;
    //}
    
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

    
    public String toString() {
        String ret = "";
        Iterator<Food> iter = listOfFoods.iterator();
        while(iter.hasNext()) {
            ret += iter.next() + "\n";
        }
        return ret;
    }
}