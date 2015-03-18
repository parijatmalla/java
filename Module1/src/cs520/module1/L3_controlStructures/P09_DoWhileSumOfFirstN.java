package cs520.module1.L3_controlStructures;

/*
 * Using a do loop to compute the 
 * sum of the first n numbers
 */

import javax.swing.*;

public class P09_DoWhileSumOfFirstN
{	
	// Method to compute the sum of the first n numbers	
	public static int sumOfFirstN(int n) 
	{
		int sum = 0;
		int counter = 1;
	
		do {
			sum = sum + counter;	
			counter = counter + 1;
		} while (counter <= n);
		
		return sum;
	}
	
	// The main method
	public static void main(String[] args) 
	{
		// Ask the user for input
		String input = JOptionPane.showInputDialog(
				"Enter an integer (> 0):"); 
		// convert the input to an integer
		int n = Integer.parseInt(input);			
	
		// call the method
		int result = sumOfFirstN(n);				
	
		// Display the result
		JOptionPane.showMessageDialog(null, 
				"Sum of the first " + n + " numbers = " + 
				result);
	}
}
		