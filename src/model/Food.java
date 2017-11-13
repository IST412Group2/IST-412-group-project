package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Food {
    private SimpleStringProperty name;
    private SimpleDoubleProperty quantity;

    /* 
     *CONSTRUCTORS
    */
    /**
     * The default Food class constructor.
     */
    public Food() {
        this("Default Food", 1);
    }
    public Food(String name, double quantity) {
        this.name = new SimpleStringProperty(name);
        this.quantity = new SimpleDoubleProperty(quantity);
    }

    /*
     * GETTERS
    */

    /**
     * Get the name of the food.
     * 
     * @return String The name of food.
     */
    public String getName() {
        return name.get();
    }

    /**
     * Get the number of servings.
     * 
     * @return int The number of servings.
     */
    public double getQuantity() {
        return quantity.get();
    }
    
    /*
     * SETTERS
    */
    public void setName(String name) {
        this.name.set(name);
    }
    
    public void setQuantity(double quantity) {
        this.quantity.set(quantity);
    }
    
    public String toString() {
        return name + ": " + quantity;
    }
}