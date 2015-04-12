package cs520.module4.L1_gui;

// A skeleton Swing application

import javax.swing.JFrame;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class P01_SwingApplication extends JFrame 
{
		// Constructor		
		public P01_SwingApplication() 
		{
			super("Skeleton GUI Application");  // Window title
			// Get any input values through dialogs	
		}

		// The drawings in the graphics context
		public void paint( Graphics g ) 
		{
			// Call the paint method of the JFrame
			super.paint(g);				
			// Draw graphics shapes
		}
			
		// The main method
		public static void main(String[] args) 
		{
			P01_SwingApplication app = new P01_SwingApplication();
			// Set the size and the visibility
			app.setSize(500,400);
			app.setVisible(true);
			// Exit on close is clicked
		 	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		}
	}