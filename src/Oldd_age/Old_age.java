/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oldd_age;


import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class Old_age extends JFrame{

    public Old_age() {
        add(new Old_age_fond());
        
        setResizable(true);
        pack();
    
    }
    
    
    public static void main(String[] args){
        
        Old_age frame = new Old_age();
        
        frame.setTitle("Renacentist age");
        frame.setSize(1100,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
