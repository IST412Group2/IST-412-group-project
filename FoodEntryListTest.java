/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import java.util.ArrayList;
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
public class FoodEntryListTest {
    
    public FoodEntryListTest() {
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
     * Test of addFood method, of class FoodEntryList.
     */
    @Test
    public void testAddFood() {
        System.out.println("addFood");
        Food newFood = new Food("apples","0","happy");
        FoodEntryList instance = new FoodEntryList();
        instance.addFood(newFood);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserFoodList method, of class FoodEntryList.
     */
    @Test
    public void testGetUserFoodList() {
        System.out.println("getUserFoodList");
        FoodEntryList instance = new FoodEntryList();
        ArrayList<Food>userFoodList = new ArrayList<>();
        ArrayList<Food> expResult = userFoodList;
        ArrayList<Food> result = instance.getUserFoodList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUserFoodList method, of class FoodEntryList.
     */
    @Test
    public void testSetUserFoodList() {
        System.out.println("setUserFoodList");
        ArrayList<Food> userFoodList = null;
        FoodEntryList instance = new FoodEntryList();
        instance.setUserFoodList(userFoodList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
