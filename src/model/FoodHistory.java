/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Matt
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class FoodHistory {
    private ArrayList<Food> listOfFoods;
    private ArrayList<LocalDate> listOfDatesEaten;
    
    public FoodHistory() {
        listOfFoods = new ArrayList<Food>();
        listOfDatesEaten = new ArrayList<LocalDate>();
    }
    
    public ArrayList<Food> addFood(Food food) {
        listOfFoods.add(food);
        return listOfFoods;
    }
     public ArrayList<LocalDate> addDate(LocalDate date) {
        listOfDatesEaten.add(date);
        return listOfDatesEaten;
    }
    
//    public ArrayList<Food> getFoods() {
//        return listOfFoods;
//    }
//    public ArrayList<Date> getDatesEaten() {
//        return listOfDatesEaten;
//    }

    /**
     * @return the listOfFoods
     */
    public ArrayList<Food> getListOfFoods() {
        return listOfFoods;
    }

    /**
     * @param listOfFoods the listOfFoods to set
     */
    public void setListOfFoods(ArrayList<Food> listOfFoods) {
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
}