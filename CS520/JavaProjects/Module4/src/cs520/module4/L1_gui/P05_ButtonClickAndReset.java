package cs520.module4.L1_gui;

// Demonstates button event handling using two buttons

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class P05_ButtonClickAndReset extends JFrame 
	implements ActionListener 
	{
		
		private JButton clickButton, resetButton;
		
		private int count = 0;				// keep track of button clicks
		
		public P05_ButtonClickAndReset() 
		{
			
			super("Button Click and Reset Demo");
			
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			clickButton = new JButton("Click me!");		// Create the first button
			clickButton.setBackground(Color.orange);
			clickButton.addActionListener( this );		// Register the event handler
			
			resetButton = new JButton("Reset!");		// Create the second button
			resetButton.setBackground(Color.blue);
			resetButton.addActionListener( this );		// Register the event handler
			
			c.add(clickButton);			// Add the buttons
			c.add(resetButton);	
			
		}

		public void paint( Graphics g ) 
		{
			super.paint(g);		
			g.setColor(Color.red);
			g.setFont(new Font("Times", Font.BOLD, 22));
			
			g.drawString("You clicked me " + count + " times", 30, 100);
		}
			
		// Event Handling Code
		public void actionPerformed( ActionEvent e ) {
			
			if (e.getSource() == clickButton) 
			{
				count++;			// Increment the count
			}
			else 
			{
				// reset button is clicked
				count = 0;
			}
			
			repaint();
		}
		
		// The main method
		
		public static void main(String[] args) 
		{
			P05_ButtonClickAndReset app = new P05_ButtonClickAndReset();
		 	app.setSize(400,250);
		 	app.setVisible(true);
		 	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		}
	}
