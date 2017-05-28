/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Middle_age;
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
public class Fond extends JPanel implements ActionListener {
    
    private Timer timer;
    
    public Fond()
    {
     timer = new Timer(25, this);
     timer.start();
    }
    
    @Override 
    public void paintComponent(Graphics l)
    {
        Image fond = loadImage("Castle_fond.png");
        l.drawImage(fond, 0, 0, 1400, 500, null);
    }
          
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
    }
    
    public Image loadImage(String imageName) 
    {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
   
    
}
