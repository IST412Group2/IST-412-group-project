
package Models;

public class Mood {
    private String name;

    public Mood(String name) {
        this.name = name;
    }

    /**
     * Get the name of the mood.
     * 
     * @return String The name of the mood.
     */
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name;
    }
}
