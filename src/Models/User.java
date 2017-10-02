package Models;

import Models.Mood;

public class User {
    private long id;
    private String name;
    private Mood mood;

    /**
     * The default constructor for the User class.
     */
    public User() {
        id = 12345646;
        mood = null;
        name = "User name";
    }

    public User(String name, String mood) {
        this.name = name;
        this.mood = new Mood();
        this.mood.setName(mood);
    }

    /**
     * Get the user's id.
     * 
     * @return long
     */
    public long getId() {
        return id;
    }
    
    /**
     * Get the user's id.
     * 
     * @return long
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the user's mood model.
     * 
     * @return Mood
     */
    public Mood getMood() {
        return mood;
    }

    /**
     * Get the user's name string.
     * 
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Set the user's mood.
     * 
     * @param mood 
     */
    public void setMood(Mood mood) {
        this.mood = mood;
    }

    /**
     * Set the user's name.
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ", " + mood;
    }
}
