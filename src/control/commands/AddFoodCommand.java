package control.commands;

import control.app;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Food;

public class AddFoodCommand {
    private Date date;
    private String foodName;
    private double quantity;
    
    public AddFoodCommand(String dateTime, String foodName, double quantity) throws ParseException {
        this.date = new SimpleDateFormat("mm/dd/yy hh:ss").parse(dateTime);
        this.foodName = foodName;
        this.quantity = quantity;
    }
    
    public void execute() {
        Food fd = new Food(foodName, quantity, date);
        app.currentUser.getFoodsEaten().addFood(fd);
    }
}
