import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

/**
 * Demonstrate how to draw a box
 * Using Mouse presses and drags
 */
public class DrawBoxes extends JFrame
{
	private int currentX = 0; // Mouse cursor's X position
	private int currentY = 0; // Mouse cursor's Y position
	private int width = 0;    // The rectangle's width
	private int height = 0;   // The rectangle's height
	private MyBoxPanel myBoxPanel;
	private int maxWidth = 500;
	private int maxHeight = 500;

	/**
	 * Hook it up with the listener
	 */
	public DrawBoxes() {
		// Add a mouse listener and a mouse motion listener.
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseMotionListener());
		setTitle("Draw Boxes");
		setSize(maxWidth,maxHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myBoxPanel = new MyBoxPanel();
	     // Set the size of the panel.
		myBoxPanel.setSize(maxWidth,maxHeight);
		add(myBoxPanel, BorderLayout.CENTER);
}

	private class MyBoxPanel extends JPanel
	{
		/**
		 * Repaint the ball based on its current location
		 */
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(currentX, currentY, width, height);
		}
	}

	/**
	 * Responds to mouse events
	 */
	private class MyMouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			// Get the coordinates of the mouse cursor.
			currentX = e.getX();
			currentY = e.getY();
		}
	}

	/**
	 * Responds to mouse motion events
	 */
	private class MyMouseMotionListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			// Calculate the size of the rectangle.
			width = e.getX() - currentX;
			height = e.getY() - currentY;

			// Repaint the window.
			repaint();
		}
	}

	public static void main(String[] args)
	{
		DrawBoxes db = new DrawBoxes();
		db.setVisible(true);
	}


}
