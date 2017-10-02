/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class FoodEntryList {
    private ArrayList<Food> userFoodList;
    private Food initFood;
    
    public FoodEntryList(){
        userFoodList = new ArrayList<>();
        initFood = new Food("apple", 0, "happy");
        userFoodList.add(initFood);
        userFoodList.remove(0);        
    }
    
    public void addFood(Food newFood){
        userFoodList.add(newFood);
    }

    /**
     * @return the userFoodList
     */
    public ArrayList<Food> getUserFoodList() {
        return userFoodList;
    }

    /**
     * @param userFoodList the userFoodList to set
     */
    public void setUserFoodList(ArrayList<Food> userFoodList) {
        this.userFoodList = userFoodList;
    }
}
