package Models;

/**
 * The food model.
 * 
 * @author Erik Galloway
 */
public class Food {
	
	private int caloriesPerServing;
	private String name;
	private double servings;
	
	/**
	 * The default Food class constructor.
	 */
	public void Food()
	{
		
	}
	
	/**
	 * Get the number of calories per serving.
	 * 
	 * @return The number of calories per serving.
	 */
	public int getCaloriesPerServing()
	{
		return 100;
	}
	
	/**
	 * Get the number of calories per serving.
	 * 
	 * @return The name of food.
	 */
	public String getName()
	{
		return "Food name";
	}
	
	/**
	 * Get the number of calories per serving.
	 * 
	 * @return The name of food.
	 */
	public double getServings()
	{
		return 1.0;
	}
	
	/**
	 * Get the total caloric intake in the food.
	 * @return The total number of calories in the food.
	 */
	public double getTotalCalories()
	{
		return this.getServings() * this.getCaloriesPerServing();
	}
	
	/**
	 * Set the number of calories per serving.
	 * @param calories The number calories per serving.
	 */
	public void setCaloriesPerServing(int calories)
	{
		this.caloriesPerServing = calories;
	}
	
	/**
	 * Set the number servings in the food.
	 * @param servings The total number of servings consumed.
	 */
	public void setServings(double servings)
	{
		this.servings = servings;
	}
	
	/**
	 * Set the number of calories per serving.
	 * @param name The name of the food.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
