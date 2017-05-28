/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oldd_age;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author JAVIER
 */
public class Principal extends JPanel implements ActionListener {
    
    private Timer timer;
    boolean mx = true;
    int secuencia = 1;
    int x = 0;
    int i = -100;
    int dinox = 200; 
    int dinoy = 300;
    
    public Principal()
    {
        timer = new Timer(250, this);
        timer.start();        
    }
    
    @Override 
    protected void paintComponent(Graphics l)
    {
        int t = secuencia*87;
        int t2 = t+78;
        Image prube = loadImage("dino.png");
        l.drawImage(prube, (dinox+i)+87, dinoy, dinox+i, dinoy +100, t, 0, t2, 
                99, null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if (secuencia ==5) {
         secuencia = 1;  
    } else {
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
