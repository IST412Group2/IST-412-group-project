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
public class Food {
    private String name;
    private double quantity;

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
        name = name;
        quantity = quantity;
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
        return name;
    }

    /**
     * Get the number of servings.
     * 
     * @return int The number of servings.
     */
    public double getQuantity() {
        return quantity;
    }
}