package cs520.module3.L2_exceptions;

import javax.swing.JOptionPane;

public class P04_Exceptions 
{
	public static void main(String[] args)
	{
		// Prompt the user for numeric input
		String 	input1 	= 
			JOptionPane.showInputDialog("Enter the first number:");
		String 	input2 	= 
			JOptionPane.showInputDialog("Enter the second number:");
		
		System.out.printf("Input1 is:%s; Input2 is:%s\n",
				input1, input2);
		int result = 0;
		try {
			// Convert the string input to an integer
			int value1 = Integer.parseInt(input1);
			int value2 = Integer.parseInt(input2);
			// Perform the division
			result = value1 / value2;
		} 
		catch (NumberFormatException e)
		{
			System.out.println(e);
		}	
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.printf("The result of %s/%s is %d\n",
				input1, input2, result);
	}
}
