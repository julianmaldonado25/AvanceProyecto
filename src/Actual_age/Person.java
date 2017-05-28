/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actual_age;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author usuario
 */
public class Person extends JPanel implements ActionListener{
    private Timer timer;
   private int secuencia = 0;
   private int wx = 100;
   private int wy = 350;
   private int i = -50;
    
    public Person(){
        timer = new Timer(25, this);
        timer.start();   
    }
    
    @Override
    public void paintComponent(Graphics l){
        int t = secuencia*24;
        int t2 = t+24;
        Image warrior = loadImage("ImagenPerson.png");
        l.drawImage(warrior, wx+i, wy,(wx+i)+50,wy+80, t, 0, t2, 27, null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (secuencia == 8) {
            secuencia = 0;
        } else  {
            secuencia++;
        }
        repaint();
    }
    public Image loadImage(String imageName) 
    {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
}
