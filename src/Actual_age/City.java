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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author usuario
 */
public class City extends JPanel implements ActionListener{
    private Timer timer;
    
    private int secuencia =  0;
     private int pox = 600;
     private int poy = 310;
     private int i = -50;
     boolean cr = true;
     int cx = 0;
     int x = 0;
    
    
    private int dox = 600;
    private int doy = 310+7;
    
    private int px =0;
    private int py = 310;
    
    
    public City(){
        addKeyListener(new TAdapter());
        setFocusable(true);
     timer = new Timer(100, this);
     timer.start();
    
    
    }
    
    @Override 
    public void paintComponent(Graphics l){
        Image fond = loadImage("MaybeAcity.jpg");
        l.drawImage(fond, 0, 0, 500, 380, null);
        Image police = loadImage("PoliceObstacleO.png");
        Image dog = loadImage("DoggieObstacle.png");
        
        Image person = loadImage("ImagenPerson.png");
               
            
        
        int t = secuencia*30;
        int t2 = t+30;
        l.drawImage(police, pox, poy,(pox)+30 /*89*/,(poy +31),t,0,t2,31, null);
        
        int t3 = secuencia*32;
        int t4 = t+32;
        l.drawImage(dog, dox, doy,(dox+32), (doy+24), t3,0, t4, 24, this);
        
        
        
        int t5 = secuencia*23;
        int t6= t5+23;
        l.drawImage(person, px, py, (px+23), (py+32), t5, 0, t6, 32, this);
        
        
    }
          
    @Override
    public void actionPerformed(ActionEvent ae) {
       if (secuencia ==3) {
            secuencia = 0;
        }else{
            secuencia++;
        }
       
        for (int j = 0; j < 10; j++) {
            
            pox-=1;
            
            
            if (pox == 0) {
                pox=600;
            }           
            //Ciclo para el policía
            
            
            
        }
        for (int k = 0; k < 6; k++) {
                dox-=1;
                if (dox==0) {
                    dox = 600;
                    //Ciclo para correr el perro
                }
                
                
            }
         /*if(cr){
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
                    py+=10*j;
                    
                    System.out.println("ciclo2");
                    repaint();
                    
                }
            }
        }
        @Override
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_SPACE) {
                int c =py;
                for (int j = 0; j < 4; j++) {
                    py-=10*j;
                    
                    repaint();
                  
                }                
                
                //x =c;
                System.out.println("Espacio");
            }
            if (key == KeyEvent.VK_UP) {
                px-=5;
            
            }
            
        }
    }
    
    
    
    
}
