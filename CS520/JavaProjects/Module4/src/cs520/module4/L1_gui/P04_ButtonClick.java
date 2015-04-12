package cs520.module4.L1_gui;

// Demonstates button event handling with one button

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class P04_ButtonClick extends JFrame 
	implements ActionListener 
	{
		private JButton clickButton;
		private int count = 0;			// keep track of button clicks
		
		// Constructor
		public P04_ButtonClick() 
		{
			super("Button Click Demo");  // Window title
			
			// Get the container and add the button
			
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			clickButton = new JButton("Click me!");		// Create a button
			clickButton.setBackground(Color.orange);
			clickButton.addActionListener( this );		// Register the event handler
			
			c.add(clickButton);			// Add the button to the Application
		}

		// repaint invocation implicitly calls the paint
		public void paint( Graphics g ) 
		{
			super.paint(g);		

			g.setColor(Color.red);
			g.setFont(new Font("Times", Font.BOLD, 22));
			 // Display the count
			g.drawString("You clicked me " + count + " times", 30, 100); 
		}
			
		// Event Handler Code
		public void actionPerformed( ActionEvent e ) 
		{
			count++;			// increment the count
			
			// Now refresh the display	
			repaint();
		}
		
		// The main method
		public static void main(String[] args) 
		{
			P04_ButtonClick app = new P04_ButtonClick();
			app.setSize(350,200);
			app.setVisible(true);
		 	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        }
	}