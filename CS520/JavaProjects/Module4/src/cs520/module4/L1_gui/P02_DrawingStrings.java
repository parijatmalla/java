package cs520.module4.L1_gui;

// Demonstates drawing of strings

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Font;

@SuppressWarnings("serial")
public class P02_DrawingStrings extends JFrame 
{
		// Constructor		
		public P02_DrawingStrings() 
		{
			super("Strings");  // Window title
		}

		// Drawing strings in the graphics context
		public void paint( Graphics g ) 
		{
			super.paint(g);	

			int x, y;
			Font 	originalFont, newFont;

			x = 20; y = 50;
			
			originalFont	= g.getFont();
			g.drawString("A string in the current font", x, y);
					
			y = y + 30;
			newFont	=	new Font("Arial", Font.PLAIN, 18);
			g.setFont(newFont);
			g.drawString("A string in Arial and Plain of size 18", x, y);
			
			y = y + 30;
			newFont	=	new Font("Arial", Font.BOLD, 18);
			g.setFont(newFont);
			g.drawString("A string in Arial and Bold of size 18", x, y);
			
			y = y + 30;
			newFont	=	new Font("Arial", Font.ITALIC, 18);
			g.setFont(newFont);
			g.drawString("A string in Arial and ITALIC of size 18", x, y);
			
			y = y + 30;
			newFont	=	new Font("Arial", Font.BOLD + Font.ITALIC, 18);
			g.setFont(newFont);
			g.drawString("A string in Arial and Bold and Italic of size 18", x, y);
	
			y = y + 30;
			newFont	=	new Font("Serif", Font.BOLD + Font.ITALIC, 24);
			g.setFont(newFont);
			g.drawString("A string in Serif and Bold and Italic of size 24", x, y);
	
			y = y + 40;
			g.setFont(originalFont);
			g.drawString("A string in the original font", x, y);				
		}
		
		// The main method
		public static void main(String[] args) 
		{
			P02_DrawingStrings app = new P02_DrawingStrings();	
			app.setSize(500,400);
			app.setVisible(true);
		 	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		}
	}