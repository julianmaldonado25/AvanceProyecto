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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author usuario
 */
public class Town extends JPanel implements ActionListener {
   
          
    private Timer timer;
    
    private int secuencia =  0;
     private int pox = 680;
     private int poy = 200;
     private int i = -50;
     boolean cr = true;
     int cx = 0;
     int x = 0;
    
    int sec =0;
    //private int dox = 600;
    //private int doy = 310+7;
    
    private int px =0;
    private int py = 200;
    
    
    public Town(){
        addKeyListener(new TAdapter());
        setFocusable(true);
     timer = new Timer(25, this);
     timer.start();
    
    
    }
    
    public void paintComponent(Graphics l){
        Image fond = loadImage("PosibleFondoRena.png");
        l.drawImage(fond, 0, 0, 640, 352, null);
        Image police = loadImage("KnightObstacle.png");
        //Image dog = loadImage("DoggieObstacle.png");
        
        Image person = loadImage("KnightWarrior.jpg");
               
            
        
        int t = secuencia*96;
        int t2 = t+96;
        l.drawImage(police, pox, poy,(pox)+30+10 ,(poy +107),t,0,t2,107, null);
        
        /*int t3 = secuencia*32;
        int t4 = t+32;
        l.drawImage(dog, dox, doy,(dox+32), (doy+24), t3,0, t4, 24, this);
        */
        
        
        int t5 = sec*65;
        int t6= t5+65;
        l.drawImage(person, px, py, (px+65), (py+99), t5, 0, t6, 99, this);
        
        
    }
          
    @Override
    public void actionPerformed(ActionEvent ae) {
       if (secuencia ==4) {
            secuencia = 0;
        }else{
            secuencia++;
        }
        if (sec==6) {
            sec=0;
        }else{
            sec++;
        }
        for (int j = 0; j < 15; j++) {
            
            pox-=1;
            
            
            if (pox == 0) {
                pox=680;
            }           
            //Ciclo para el policía
            
            
            
        }
        /*for (int k = 0; k < 6; k++) {
                dox-=1;
                if (dox==0) {
                    dox = 600;
                    //Ciclo para correr el perro
                }
                
                
            }
         *//*if(cr){
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
        */
        
        
        repaint();
        
        
    }
    
    public Image loadImage(String imageName) 
    {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    
    
    
    
    private class TAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e){
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_SPACE) {
            for (int j = 3; j > 0; j--) {
                    py+=30*j;
                    
                    System.out.println("ciclo2");
                    repaint();
                    
                }
            }
            if (key == KeyEvent.VK_UP) {
                py=200;
            
            }
        }
        @Override
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_SPACE) {
                int c =py;
                for (int j = 0; j < 4; j++) {
                    py-=30*j;
                    
                    repaint();
                  
                }                
                
                //x =c;
                System.out.println("Espacio");
            }
            if (key == KeyEvent.VK_UP) {
                py=60;
            
            }
            
        }
    
}}
