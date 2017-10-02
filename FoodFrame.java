/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Matt
 */
public class FoodFrame extends JFrame{
    private FoodView fv;
    private JFrame frm;
    
    public FoodFrame(){
        super();
        frm = new JFrame("Food Mood");
        frm.setPreferredSize(new Dimension(800, 800));
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout()); 
        fv = new FoodView();
        frm.add(fv);
        
        
        frm.setResizable(false);
        frm.setVisible(true);
        
        frm.pack();
    }

    /**
     * @return the fv
     */
    public FoodView getFv() {
        return fv;
    }

    /**
     * @param fv the fv to set
     */
    public void setFv(FoodView fv) {
        this.fv = fv;
    }
}
