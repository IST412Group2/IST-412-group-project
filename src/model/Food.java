package model;

import java.io.Serializable;
import java.util.Date;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Food implements Serializable{
    private SimpleStringProperty name;
    private SimpleDoubleProperty quantity;
    private Date date;

    /* 
     *CONSTRUCTORS
    */
    /**
     * The default Food class constructor.
     */
    public Food() {
        this("Default Food", 1, new Date());
    }
    public Food(String name, double quantity, Date date) {
        this.name = new SimpleStringProperty(name);
        this.quantity = new SimpleDoubleProperty(quantity);
        this.date = date;
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
    
    /**
     * Get the date.
     * 
     * @return Date The date.
     */
    public Date getDate() {
        return date;
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
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public String toString() {
        return date + " " + name + ": " + quantity;
    }
}