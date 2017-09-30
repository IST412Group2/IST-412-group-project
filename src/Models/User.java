package Models;

import Models.Mood;

/**
 * User model.
 * 
 * @author Erik Galloway
 */
public class User {
	
	private long id;
	private String name;
	private Mood mood;
	
	/**
	 * The default constructor for the User class.
	 */
	public User()
	{
	
	}
	
	/**
	 * Get the user's id.
	 * 
	 * @return long
	 */
	public long getId()
	{
		return 12345646;
	}
	
	/**
	 * Get the user's mood model.
	 * 
	 * @return Mood
	 */
	public Mood getMood()
	{
		return new Mood();
	}
	
	/**
	 * Get the user's name string.
	 * 
	 * @return String
	 */
	public String getName()
	{
		return "User name";
	}
	
	/**
	 * Set the user's mood.
	 * 
	 * @param mood 
	 */
	public void setMood(Mood mood)
	{
		this.mood = mood;
	}
	
	/**
	 * Set the user's name.
	 * 
	 * @param name 
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
