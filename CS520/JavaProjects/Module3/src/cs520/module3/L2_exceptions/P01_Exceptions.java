package cs520.module3.L2_exceptions;

import javax.swing.JOptionPane;

public class P01_Exceptions 
{
	public static void main(String[] args)
	{
			// Prompt the user for numeric input
			String 	input 	= 
				JOptionPane.showInputDialog("Enter a number:");
			System.out.printf("Input is:%s; Length = %d\n",
					input, input.length());
			int result = 0;
			// Convert the string input to an integer
			int value = Integer.parseInt(input);	
			result = value * value;
			System.out.printf("The square of %d is %d\n",
					value, result);
	}
}
