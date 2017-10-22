/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Matt
 */
public class User {
    private String name, username, password;
    private FoodHistory foodsEaten;
//    private MoodHistory moodsFelt;

    /*
     * CONSTRUCTORS
    */
    
    /**
     * The default constructor for the User class.
     */
    public User() {
        this("Default user name", "", "");
    }

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
//        this.moodsFelt = new MoodHistory();
        this.foodsEaten = new FoodHistory();
    }
    
    /* 
     * SETTERS
    */
    /**
     * Set the user's name.
     * 
     * @param name the user's name
     */
    public void setName(String name) {
        this.name = name;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void changePassword(String password) {
        this.password = password;
    }
    public void addFood(Food food) {
        foodsEaten.addFood(food);
    }
    public void addDate(LocalDate date) {
        foodsEaten.addDate(date);
    }
    /**
     * Add a new mood to the user's history.
     * 
     * @param mood the current mood which the user wants to add 
     */
    /*public void addMood(Mood mood) {
        this.moodsFelt.addMood(mood);
    }
    
    /*
     * GETTERS
    */
    /**
     * Get the user's name string.
     * 
     * @return a String of the user's name
     */
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public FoodHistory getFoodsEaten() {
        return foodsEaten;
    }
    /**
     * Get the user's mood list.
     * 
     * @return a list of the user's moods
     */
    /*public MoodHistory getMoodsFelt() {
        return moodsFelt;
    }
    
    /*
     * OTHER FUNCTIONS
    */
    public boolean authenticate(String username, String password) {
        return (this.username.equals(username)) && (this.password.equals(password));
    }
    
    public String toString() {
        return name;
    }
}