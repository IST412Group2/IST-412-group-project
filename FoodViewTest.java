/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
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
public class FoodViewTest {
    
    public FoodViewTest() {
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
     * Test of getFoodAndMoodLabel method, of class FoodView.
     */
    @Test
    public void testGetFoodAndMoodLabel() {
        System.out.println("getFoodAndMoodLabel");
        FoodView instance = new FoodView();
        JLabel expResult = null;
        JLabel result = instance.getFoodAndMoodLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFoodAndMoodLabel method, of class FoodView.
     */
    @Test
    public void testSetFoodAndMoodLabel() {
        System.out.println("setFoodAndMoodLabel");
        JLabel foodAndMoodLabel = null;
        FoodView instance = new FoodView();
        instance.setFoodAndMoodLabel(foodAndMoodLabel);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFoodNameField method, of class FoodView.
     */
    @Test
    public void testGetFoodNameField() {
        System.out.println("getFoodNameField");
        FoodView instance = new FoodView();
        JTextField expResult = null;
        JTextField result = instance.getFoodNameField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFoodNameField method, of class FoodView.
     */
    @Test
    public void testSetFoodNameField() {
        System.out.println("setFoodNameField");
        JTextField foodNameField = null;
        FoodView instance = new FoodView();
        instance.setFoodNameField(foodNameField);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFoodAmountField method, of class FoodView.
     */
    @Test
    public void testGetFoodAmountField() {
        System.out.println("getFoodAmountField");
        FoodView instance = new FoodView();
        JTextField expResult = null;
        JTextField result = instance.getFoodAmountField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFoodAmountField method, of class FoodView.
     */
    @Test
    public void testSetFoodAmountField() {
        System.out.println("setFoodAmountField");
        JTextField foodAmountField = null;
        FoodView instance = new FoodView();
        instance.setFoodAmountField(foodAmountField);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMoodField method, of class FoodView.
     */
    @Test
    public void testGetMoodField() {
        System.out.println("getMoodField");
        FoodView instance = new FoodView();
        JTextField expResult = null;
        JTextField result = instance.getMoodField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMoodField method, of class FoodView.
     */
    @Test
    public void testSetMoodField() {
        System.out.println("setMoodField");
        JTextField moodField = null;
        FoodView instance = new FoodView();
        instance.setMoodField(moodField);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSaveButton method, of class FoodView.
     */
    @Test
    public void testGetSaveButton() {
        System.out.println("getSaveButton");
        FoodView instance = new FoodView();
        JButton expResult = null;
        JButton result = instance.getSaveButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSaveButton method, of class FoodView.
     */
    @Test
    public void testSetSaveButton() {
        System.out.println("setSaveButton");
        JButton saveButton = null;
        FoodView instance = new FoodView();
        instance.setSaveButton(saveButton);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
