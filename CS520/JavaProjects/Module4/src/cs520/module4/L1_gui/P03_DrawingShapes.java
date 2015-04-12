package cs520.module4.L1_gui;

// Demonstates drawing of basic shapes

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

@SuppressWarnings("serial")
public class P03_DrawingShapes extends JFrame 
{
		// Constructor
		public P03_DrawingShapes() 
		{
			super("Basic Shapes");  // Window title
		}

		// The drawings in the graphics context
		public void paint( Graphics g ) 
		{
			super.paint(g);	
			
			int 	x1, y1, x2, y2;

			x1 = 20; y1 = 50;
			x2 = 80; y2 = 90;
			// draw a line between (20, 50) and (80, 90)
			g.drawLine(x1, y1, x2, y2);		
			// draw a line between (20, 90) and (80, 50)
			g.drawLine(x1, y2, x2, y1);		
				
			// Draw a rectangle and square
			x1 = 100; y1 = 50;
			g.drawRect(x1, y1, 100, 50);

			g.setColor(Color.red);
			x1 = 220; y1 = 50;
			g.drawRect(x1, y1, 75, 75);

			// Draw Filled rectangle and square		
			g.setColor(Color.blue);
			x1 = 100; y1 = 150;
			g.fillRect(x1, y1, 100, 50);

			g.setColor(Color.cyan);
			x1 = 220; y1 = 150;
			g.fillRect(x1, y1, 75, 75);

			// Draw a oval and a square
			g.setColor(Color.black);
			x1 = 20; y1 = 250;
			g.drawOval(x1, y1, 100, 50);

			g.setColor(Color.red);
			x1 = 130; y1 = 250;
			g.drawOval(x1, y1, 75, 75);

			// Draw a filled oval and a square
			g.setColor(Color.blue);
			x1 = 220; y1 = 250;
			g.fillOval(x1, y1, 100, 50);

			g.setColor(Color.black);
			x1 = 350; y1 = 250;
			g.fillOval(x1, y1, 75, 75);
		
			// Draw an elliptical arc and a circular arc
			x1 = 20; y1 = 350;
			g.drawArc(x1, y1, 100, 50, 0, 90);

			g.setColor(Color.red);
			x1 = 130; y1 = 350;
			g.drawArc(x1, y1, 75, 75, 0, 90);
			
			// Draw a filled elliptical and circular arc
			g.setColor(Color.blue);
			x1 = 220; y1 = 350;
			g.fillArc(x1, y1, 100, 50, 0, 90);

			g.setColor(Color.black);
			x1 = 350; y1 = 350;
			g.fillArc(x1, y1, 75, 75, 0, 90);
		}
			
		// The main method
		public static void main(String[] args) 
		{
			P03_DrawingShapes app = new P03_DrawingShapes();	
			app.setSize(500,500);
			app.setVisible(true);
		 	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		}
	}