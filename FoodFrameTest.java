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
public class FoodFrameTest {
    
    public FoodFrameTest() {
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
     * Test of getFv method, of class FoodFrame.
     */
    @Test
    public void testGetFv() {
        System.out.println("getFv");
        FoodFrame instance = new FoodFrame();
        FoodView expResult = null;
        FoodView result = instance.getFv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFv method, of class FoodFrame.
     */
    @Test
    public void testSetFv() {
        System.out.println("setFv");
        FoodView fv = new FoodView();
        FoodFrame instance = new FoodFrame();
        instance.setFv(fv);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
