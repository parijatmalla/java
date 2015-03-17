package cs520.module1.L3_controlStructures;

/* 
 * Compute the product of the first n numbers, 
 * given a maximum limit for the product
 */

import javax.swing.*;

public class P10_BreakExample
{
	public static void productOfFirstN(int n, int max_value)  
	{
		int counter = 1;
		int product = 1;
		
		while (counter <= n) 
		{
			product = product * counter;
			if (product >= max_value) 
			{				
				// Break out of the loop, done!
				JOptionPane.showMessageDialog(null, 
						"Max value reached: " + 
						"The factorial of " + counter + 
						" is " + product);
				break;
			}
			counter++;	
		}

		// When all the values up to n are used
		if (counter > n) 
		{
			JOptionPane.showMessageDialog(null,
				"The factorial of " + n + " is " + product);
		}
	}
	
	// main method
	
	public static void main(String[] args) 
	{
		String input;
		
		// Ask the user for input
		input = JOptionPane.showInputDialog(
				"Enter an integer (>= 1):"); 
		// convert to an integer
		int n = Integer.parseInt(input);			
		
		// Ask the user for the other input
		input = JOptionPane.showInputDialog(
				"Enter the Max Value (>= 1):"); 
		// convert to an integer
		int maxValue = Integer.parseInt(input);		
		
		// invoke the method
		productOfFirstN(n, maxValue);				
	}
}
