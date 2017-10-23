package control.commands;

import control.app;
import model.Food;

public class AddFoodCommand {
    private String foodName;
    private double quantity;
    
    public AddFoodCommand(String foodName, double quantity) {
        this.foodName = foodName;
        this.quantity = quantity;
    }
    
    public void execute() {
        Food fd = new Food(foodName, quantity);
        app.currentUser.getFoodsEaten().addFood(fd);
    }
}
