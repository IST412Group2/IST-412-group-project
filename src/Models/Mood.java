/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * The mood model.
 * @author Erik Galloway
 */
public class Mood {

	private String name;
	private User user;

	
	/**
	 * The default mood model constructor.
	 */
	public void Mood()
	{
	}
	
	/**
	 * Get the owning user model of the mood.
	 * 
	 * @return The user model who the mood belongs to.
	 */
	public User getUser()
	{
		return new User();
	}
	
	/**
	 * Get the name of the mood.
	 * @return The name of the mood.
	 */
	public String getName()
	{
		return "happy";
	}
	
	/**
	 * Set the user model the mood belongs to.
	 * @param user 
	 */
	public void setUser(User user)
	{
		this.user = user;
	}
	
	/**
	 * Set the name of the mood.
	 * @param name 
	 */
	public void setName(String name)
	{
		this.name = name;
	}
}
