/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Matt
 */
public class FoodController implements ActionListener {
    private FoodEntryList theFoodList;
    private FoodFrame foodUI;
    private Food theFood;
    
    public FoodController(){
        theFoodList = new FoodEntryList();
        foodUI = new FoodFrame();
        foodUI.setVisible(true);
        foodUI.getFv().getSaveButton().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
            String foodAmount = foodUI.getFv().getFoodAmountField().getText();
            theFood = new Food(foodUI.getFv().getFoodNameField().getText(), foodAmount, foodUI.getFv().getMoodField().getText());
            theFoodList.getUserFoodList().add(theFood);
            for(int i = 0; i<theFoodList.getUserFoodList().size(); ++i){
            String tempFoodName = theFoodList.getUserFoodList().get(i).getFoodName();
            String tempFoodAmount = theFoodList.getUserFoodList().get(i).getFoodAmount();
            String tempCurMood = theFoodList.getUserFoodList().get(i).getMood();
            foodUI.getFv().getFoodAndMoodLabel().setText("Food: "+tempFoodName+ "    Amount: "+tempFoodAmount+" ounces    Mood: "+tempCurMood);
        }
    }
}
