package Models;

public class Food {
    private int caloriesPerServing;
    private String name;
    private double servings;

    /**
     * The default Food class constructor.
     */
    public Food() {
        caloriesPerServing = 100;
        name = "Default Food";
        servings = 1;
    }

    /**
     * Get the number of calories per serving.
     * 
     * @return The number of calories per serving.
     */
    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

    /**
     * Get the name of the food.
     * 
     * @return The name of food.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the number of servings.
     * 
     * @return The number of servings.
     */
    public double getServings() {
        return servings;
    }

    /**
     * Get the total caloric intake in the food.
     * @return The total number of calories in the food.
     */
    public double getTotalCalories() {
        return this.getServings() * this.getCaloriesPerServing();
    }

    /**
     * Set the number of calories per serving.
     * @param calories The number calories per serving.
     */
    public void setCaloriesPerServing(int calories) {
        this.caloriesPerServing = calories;
    }

    /**
     * Set the number servings in the food.
     * @param servings The total number of servings consumed.
     */
    public void setServings(double servings) {
        this.servings = servings;
    }

    /**
     * Set the name of the food.
     * @param name The name of the food.
     */
    public void setName(String name) {
        this.name = name;
    }
}
