/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class FoodView extends JPanel {
    private JLabel foodNameLabel;
    private JLabel foodAmountLabel;
    private JLabel moodLabel;
    private JLabel foodAndMoodLabel;
    private JLabel chooseMoodLabel;
    private JTextField foodNameField;
    private JTextField foodAmountField;
    private JTextField moodField;
    private Box nameBox, amountBox, moodBox;
    private JButton saveButton;
    private JComboBox dropdown;
    private JLabel recommendation;
    private double amount;
    
    public FoodView(){
        super();
        this.setLayout(new GridLayout(8,1,10,50));
        foodNameLabel = new JLabel("Food:        ");
        foodAmountLabel = new JLabel("Amount:   ");
        moodLabel = new JLabel("Mood:       ");
        foodAndMoodLabel = new JLabel();
        chooseMoodLabel = new JLabel("Choose your desired mood.");
        foodNameField = new JTextField("Enter food eaten.");
        foodNameField.setSize(200, 50);
        foodAmountField = new JTextField("Enter amount of food Eaten");
        amount = Double.parseDouble(foodAmountField.getText());
        moodField = new JTextField("Enter mood.");
        saveButton = new JButton("Save");
        nameBox = Box.createHorizontalBox();
        nameBox.add(foodNameLabel);
        nameBox.add(foodNameField);
        amountBox = Box.createHorizontalBox();
        amountBox.add(foodAmountLabel);
        amountBox.add(foodAmountField);
        moodBox = Box.createHorizontalBox();
        moodBox.add(moodLabel);
        moodBox.add(moodField);
        
        
        String[] moodSelection = {"","Happy", "Normal", "Sad"};        
        dropdown = new JComboBox(moodSelection);
        dropdown.addItemListener(
                new ItemListener(){
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED){
                            int index = 0;
                            index = dropdown.getSelectedIndex();
                            if(index == 1){recommendation.setText("You should eat more fruits and vegetables!");}
                            else if(index == 2){recommendation.setText("You can have a small snack");}
                            else if(index == 3){recommendation.setText("Have some fatty foods at your own risk!");}
                        }
            }
                    
                }
        );
        recommendation = new JLabel();
        this.add(nameBox);
        this.add(amountBox);
        this.add(moodBox);
        this.add(saveButton);
        this.add(foodAndMoodLabel);
        this.add(chooseMoodLabel);
        this.add(dropdown);
        this.add(recommendation);
        this.setVisible(true);
    }

    /**
     * @return the foodAndMoodLabel
     */
    public JLabel getFoodAndMoodLabel() {
        return foodAndMoodLabel;
    }

    /**
     * @param foodAndMoodLabel the foodAndMoodLabel to set
     */
    public void setFoodAndMoodLabel(JLabel foodAndMoodLabel) {
        this.foodAndMoodLabel = foodAndMoodLabel;
    }

    /**
     * @return the dropdown
     */
    public JComboBox getDropdown() {
        return dropdown;
    }

    /**
     * @param dropdown the dropdown to set
     */
    public void setDropdown(JComboBox dropdown) {
        this.dropdown = dropdown;
    }

    /**
     * @return the recommendation
     */
    public JLabel getRecommendation() {
        return recommendation;
    }

    /**
     * @param recommendation the recommendation to set
     */
    public void setRecommendation(JLabel recommendation) {
        this.recommendation = recommendation;
    }
    

    /**
     * @return the foodNameLabel
     */
    public JLabel getFoodNameLabel() {
        return foodNameLabel;
    }

    /**
     * @param foodNameLabel the foodNameLabel to set
     */
    public void setFoodNameLabel(JLabel foodNameLabel) {
        this.foodNameLabel = foodNameLabel;
    }

    /**
     * @return the foodAmountLabel
     */
    public JLabel getFoodAmountLabel() {
        return foodAmountLabel;
    }

    /**
     * @param foodAmountLabel the foodAmountLabel to set
     */
    public void setFoodAmountLabel(JLabel foodAmountLabel) {
        this.foodAmountLabel = foodAmountLabel;
    }

    /**
     * @return the foodNameField
     */
    public JTextField getFoodNameField() {
        return foodNameField;
    }

    /**
     * @param foodNameField the foodNameField to set
     */
    public void setFoodNameField(JTextField foodNameField) {
        this.foodNameField = foodNameField;
    }

    /**
     * @return the foodAmountField
     */
    public JTextField getFoodAmountField() {
        return foodAmountField;
    }

    /**
     * @param foodAmountField the foodAmountField to set
     */
    public void setFoodAmountField(JTextField foodAmountField) {
        this.foodAmountField = foodAmountField;
    }

    /**
     * @return the nameBox
     */
    public Box getNameBox() {
        return nameBox;
    }

    /**
     * @param nameBox the nameBox to set
     */
    public void setNameBox(Box nameBox) {
        this.nameBox = nameBox;
    }

    /**
     * @return the amountBox
     */
    public Box getAmountBox() {
        return amountBox;
    }

    /**
     * @param amountBox the amountBox to set
     */
    public void setAmountBox(Box amountBox) {
        this.amountBox = amountBox;
    }

    /**
     * @return the moodLabel
     */
    public JLabel getMoodLabel() {
        return moodLabel;
    }

    /**
     * @param moodLabel the moodLabel to set
     */
    public void setMoodLabel(JLabel moodLabel) {
        this.moodLabel = moodLabel;
    }

    /**
     * @return the moodField
     */
    public JTextField getMoodField() {
        return moodField;
    }

    /**
     * @param moodField the moodField to set
     */
    public void setMoodField(JTextField moodField) {
        this.moodField = moodField;
    }

    /**
     * @return the moodBox
     */
    public Box getMoodBox() {
        return moodBox;
    }

    /**
     * @param moodBox the moodBox to set
     */
    public void setMoodBox(Box moodBox) {
        this.moodBox = moodBox;
    }

    /**
     * @return the saveButton
     */
    public JButton getSaveButton() {
        return saveButton;
    }

    /**
     * @param saveButton the saveButton to set
     */
    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
