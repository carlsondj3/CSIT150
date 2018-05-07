/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
/**
 *
 * @author andersoncl4
 */
public class CardDisplay extends JPanel{
    
    public CardDisplay()
    {
        
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
      
        g2d.setColor(Color.GREEN);
      
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        g2d.fillRect(300,400,50,50);
        g2d.rotate(Math.toRadians(-30),325,325);
        
        
        ////
         g2d.setColor(Color.RED);
         g2d.fillRect(300,300,50,50);
         g2d.rotate(Math.toRadians(45),325,325);
         g2d.fillRect(300,300,50,50);
         
         g2d.rotate(Math.toRadians(-45),325,325); 
        
        BufferedImage img1 = null;
        BufferedImage img2 = null;
        BufferedImage img3 = null;
        BufferedImage img4 = null;
        BufferedImage img5 = null;
        try {
               // img = ImageIO.read(new File("clubs_king.png"));
                img1 = ImageIO.read(new File("cards/clubs_king.png"));
                Graphics2D g2= (Graphics2D)g;
                g2.rotate(Math.toRadians(-10), 100, 100);
                g2.drawImage(img1, 50, 50,50,75, null);
        } 
        catch (Exception e) 
        {
            System.err.print("\nTrouble reading image file: "+"clubs_king.png");
        }
        
        try {
                img2 = ImageIO.read(new File("cards/diamonds_jack.png"));
                Graphics2D g22= (Graphics2D)g;
                g22.rotate(Math.toRadians(10), 50, 50);
                g22.drawImage(img2, 65, 40,50,75, null);
        } 
        catch (Exception e) 
        {
            System.err.print("\nTrouble reading image file: "+"diamonds_ace.png");
        }
        
        try {
                img3 = ImageIO.read(new File("cards/spades_ace.png"));
                Graphics2D g22= (Graphics2D)g;
                g22.rotate(Math.toRadians(10), 50, 50);
                g22.drawImage(img3, 80, 30,50,75, null);
        } 
        catch (Exception e) 
        {
            System.err.print("\nTrouble reading image file: "+"diamonds_ace.png");
        }
        
        
        try {
                img4 = ImageIO.read(new File("cards/hearts_ten.png"));
                Graphics2D g22= (Graphics2D)g;
                g22.rotate(Math.toRadians(10), 50, 50);
                g22.drawImage(img4, 95, 20,50,75, null);
        } 
        catch (Exception e) 
        {
            System.err.print("\nTrouble reading image file: "+"diamonds_ace.png");
        }
        
        
        
        try {
                img5 = ImageIO.read(new File("cards/clubs_three.png"));
                Graphics2D g22= (Graphics2D)g;
                g22.rotate(Math.toRadians(10), 50, 50);
                g22.drawImage(img5, 110, 10,50,75, null);
        } 
        catch (Exception e) 
        {
            System.err.print("\nTrouble reading image file: "+"diamonds_ace.png");
        }
    }
    
}
