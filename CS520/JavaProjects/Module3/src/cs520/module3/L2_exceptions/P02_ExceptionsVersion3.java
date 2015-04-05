package cs520.module3.L2_exceptions;

import javax.swing.JOptionPane;

public class P02_ExceptionsVersion3 
{
	public static void main(String[] args)
	{
		String input = null;
		int result = 0;
		try {
			// Prompt the user for numeric input
			input = 
				JOptionPane.showInputDialog("Enter a number:");
			System.out.printf("Input is:%s; Length = %d\n",
					input, input.length());
			// Convert the string input to an integer
			int value = Integer.parseInt(input);	
			result = value * value;
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}	
		// Program continues even if there is an exception
		System.out.printf("The square of %s is %d\n",
				input, result);
	}
}
