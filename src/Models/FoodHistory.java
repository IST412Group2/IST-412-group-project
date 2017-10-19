/* 
 * TODO
 * 
 * ADD DATE WHEN ADDING NEW FOOD
 *  - CONSIDER NEW DATA TYPE (HASHMAP ?)
*/

package Models;

import java.util.ArrayList;
import java.util.Date;

public class FoodHistory {
    private ArrayList<Food> listOfFoods;
    private ArrayList<Date> listOfDatesEaten;
    
    public FoodHistory() {
        listOfFoods = new ArrayList<Food>();
        listOfDatesEaten = new ArrayList<Date>();
    }
    
    public void addFood(Food food) {
        listOfFoods.add(food);
        listOfDatesEaten.add(new Date());
    }
    public ArrayList<Food> getFoods() {
        return listOfFoods;
    }
    public ArrayList<Date> getDatesEaten() {
        return listOfDatesEaten;
    }
}
