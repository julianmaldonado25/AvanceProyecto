/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Renacentist_age;


import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class Renacentist_age extends JFrame{

    public Renacentist_age() {
        add(new Town());
        
        setResizable(false);
        pack();
    
    }
    
    
    
    public static void main(String[] args){
        Renacentist_age frame = new Renacentist_age();
        
        frame.setTitle("Renacentist age");
        frame.setSize(640,352);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    
}
