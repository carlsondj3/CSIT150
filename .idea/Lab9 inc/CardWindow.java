/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author andersoncl4
 */
public class CardWindow extends JFrame{
    
    private int win_width = 800;
    private int win_height = 600;

    private CardDisplay panel;

    
    public CardWindow()
    {
        this.setTitle("Exercise Window");
        this.setSize(win_width,win_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        inititalizeWindow();
        
        this.setVisible(true);
        
    }
    
   public void inititalizeWindow()
  {
         panel = new CardDisplay();
         this.add(panel, BorderLayout.CENTER);
  }


    
    
    public static void main(String[] args)
    {
        CardWindow ew = new CardWindow();
    }
    
}
