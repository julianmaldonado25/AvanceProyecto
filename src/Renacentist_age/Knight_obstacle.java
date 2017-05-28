/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Renacentist_age;

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
public class Knight_obstacle extends JPanel implements ActionListener {
 private Timer timer;
     private int secuencia =  0;
     private int wex = 600;
     private int wey = 300;
     private int i = -50;
     boolean cr = true;
     int cx = 0;
     int x = 0;
    
    public Knight_obstacle(){
        timer = new Timer(25, this);
        timer.start();   
    }
    
    @Override
    public void paintComponent(Graphics l){
        int t = secuencia*60;
        int t2 = t+60;
        Image wizard = loadImage("KnightObstacle.png");
        //l.fillRect(wex+i, 300, t, t2);
        l.drawImage(wizard, (wex+i)+60, wey, wex+i, wey+80, t, 180,t2 , 270, null);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (secuencia == 8) {
            secuencia = 0;
        } else  {
            secuencia++;
        }
         if(cr){
           i-=5;
           x-=2; 
           cx = i;
           if(cx == 50){
               cr = false;
           }
        }else{
           i-=5;
           x+=2; 
           cx = i;
           if(cx == -700){
               cx =0;
               cr = true;
           }
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
