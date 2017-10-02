/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class FoodTest {
    
    public FoodTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFoodName method, of class Food.
     */
    @Test
    public void testGetFoodName() {
        System.out.println("getFoodName");
        Food instance = new Food();
        String expResult = "apple";
        String result = instance.getFoodName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFoodName method, of class Food.
     */
    @Test
    public void testSetFoodName() {
        System.out.println("setFoodName");
        String foodName = "apple";
        Food instance = new Food();
        instance.setFoodName(foodName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFoodAmount method, of class Food.
     */
    @Test
    public void testGetFoodAmount() {
        System.out.println("getFoodAmount");
        Food instance = new Food();
        String expResult = "0";
        String result = instance.getFoodAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFoodAmount method, of class Food.
     */
    @Test
    public void testSetFoodAmount() {
        System.out.println("setFoodAmount");
        String foodAmount = "0";
        Food instance = new Food();
        instance.setFoodAmount(foodAmount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentMood method, of class Food.
     */
    @Test
    public void testGetMood() {
        System.out.println("getMood");
        Food instance = new Food();
        String expResult = "Happy";
        String result = instance.getMood();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentMood method, of class Food.
     */
    @Test
    public void testSetMood() {
        System.out.println("setMood");
        String currentMood = "Happy";
        Food instance = new Food();
        instance.setMood(currentMood);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
