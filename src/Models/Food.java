package Models;

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
        this.name = name;
        this.quantity = quantity;
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
