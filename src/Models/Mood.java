
package Models;

public class Mood {
    private String name;
    private User user;

    public Mood(String name) {
        this.name = name;
    }

    /**
     * The default mood model constructor.
     */
    public Mood() {
        user = null;
        name = "happy";
    }

    /**
     * Get the owning user model of the mood.
     * 
     * @return The user model whom the mood belongs to.
     */
    public User getUser() {
        return user;
    }

    /**
     * Get the name of the mood.
     * @return The name of the mood.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the user model the mood belongs to.
     * @param user 
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Set the name of the mood.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name;
    }
}
