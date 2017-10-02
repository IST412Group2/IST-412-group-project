/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

/**
 *
 * @author Matt
 */
public class Food {
    private String foodName;
    private String foodAmount;
    private String mood;
    
    public Food(String newFoodName, String newFoodAmount, String newMood){
        foodName = newFoodName;
        foodAmount = newFoodAmount;
        mood = newMood;
    }
    
    public Food(){
        foodName = "apple";
        foodAmount = "";
        mood = "Happy";
    }

    /**
     * @return the foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param foodName the foodName to set
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @return the foodAmount
     */
    public String getFoodAmount() {
        return foodAmount;
    }

    /**
     * @param foodAmount the foodAmount to set
     */
    public void setFoodAmount(String foodAmount) {
        this.foodAmount = foodAmount;
    }

    /**
     * @return the currentMood
     */
    public String getMood() {
        return mood;
    }

    /**
     * @param currentMood the currentMood to set
     */
    public void setMood(String currentMood) {
        this.mood = currentMood;
    }
}
