/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Middle_age;

import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class Middle_age extends JFrame{

    public Middle_age() {
        add(new Fond());
        setResizable(true);
        pack();
        
    }
    
        
    public static void main(String[] args){
        Middle_age frame = new Middle_age();
        
        frame.setTitle("Renacentist age");
        frame.setSize(1400,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
