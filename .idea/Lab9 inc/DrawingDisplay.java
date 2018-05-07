/*
 * Demo Code for reviewing Graphics
 * CSIS 402 Fall 2013
 * C.Anderson
 */

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author canderson
 */
public class DrawingDisplay extends JFrame{
    
    int WINDOW_WIDTH = 1200;
    int WINDOW_HEIGHT = 600;
    int ROWS = 1;
    int COLUMNS = 2;
    
    public DrawingDisplay()
    {
        this.setTitle("Pretty Picture");
        this.setLayout(new GridLayout(ROWS,COLUMNS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FormCircleArray fca = new FormCircleArray(40);
        int[][] circs = fca.getCircs();
        
        FormRecArray fra = new FormRecArray(240);
        int[][] recs = fra.getRecs();
        
        DrawingPanel panel = new DrawingPanel(circs, recs, null);
        
        add(panel);
        this.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setVisible(true); 
       
    }
    
    public static void main(String[] args)
    {
        DrawingDisplay dd = new DrawingDisplay();
    }
}
    