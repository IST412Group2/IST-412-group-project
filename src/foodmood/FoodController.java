
package foodmood;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FoodController implements ActionListener {
    private FoodEntryList theFoodList;
    private FoodView foodUI;
    private Food theFood;
    
    public FoodController(){
        theFoodList = new FoodEntryList();
        foodUI = new FoodView();
        foodUI.setVisible(true);
        foodUI.getSaveButton().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
            String foodAmount = foodUI.getFoodAmountField().getText();
            theFood = new Food(foodUI.getFoodNameField().getText(), foodAmount, foodUI.getMoodField().getText());
            theFoodList.getUserFoodList().add(theFood);
            for(int i = 0; i<theFoodList.getUserFoodList().size(); ++i){
            String tempFoodName = theFoodList.getUserFoodList().get(i).getFoodName();
            String tempFoodAmount = theFoodList.getUserFoodList().get(i).getFoodAmount();
            String tempCurMood = theFoodList.getUserFoodList().get(i).getMood();
            foodUI.getFoodAndMoodLabel().setText("Food: "+tempFoodName+ "    Amount: "+tempFoodAmount+" ounces    Mood: "+tempCurMood);
        }
    }
}
