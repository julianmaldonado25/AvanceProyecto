/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actual_age;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author usuario
 */
public class Actual_age extends JFrame{
    public Actual_age(){
        add(new City());
        //add(new Person());
        //add(new Police_obstacle());
        setResizable(false);
        pack();
    }
    public static void main(String[] args){
        
        Actual_age frame = new Actual_age();
        
        frame.setTitle("Actual age");
        frame.setSize(500,380);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
    
}
