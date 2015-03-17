package cs520.module1.L3_controlStructures;

/* 
 * Compute the product of the first n numbers, 
 * given a maximum limit for the product
 */

import javax.swing.*;

public class P11_ContinueExample
{
	public static void pattern(int n)  
	{
		for (int row = 1; row <= n; row++)
		{
			for (int col = 1; col <= n; col++)
			{
				//if (col > row)
					//continue;
				System.out.printf("%3d", col);
			}
			System.out.println();
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
		
		// invoke the method
		pattern(n);				
	}
}
