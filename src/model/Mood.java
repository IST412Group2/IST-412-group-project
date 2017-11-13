package model;

import java.io.Serializable;

public class Mood implements Serializable{
    private String name;
    
    public Mood() {
        this("Default Mood");
    }
    public Mood(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name;
    }
}
