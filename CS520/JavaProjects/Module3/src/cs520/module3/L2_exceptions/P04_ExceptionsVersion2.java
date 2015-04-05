package cs520.module3.L2_exceptions;

import javax.swing.JOptionPane;

public class P04_ExceptionsVersion2 
{
	public static void main(String[] args)
	{
		String input1 = null;
		String input2 = null;
		int result = 0;
		try {
			// Prompt the user for numeric input
			input1 	= 
				JOptionPane.showInputDialog("Enter the first number:");
			input2 	= 
				JOptionPane.showInputDialog("Enter the second number:");
			
			System.out.printf("Input1 is:%s; Input2 is:%s\n",
					input1, input2);

			result = 0;
			// Convert the string input to an integer
			int value1 = Integer.parseInt(input1);
			int value2 = Integer.parseInt(input2);
			// Perform the division
			result = value1 / value2;

			System.out.printf("The result of %s/%s is %d\n",
					input1, input2, result);
		} 
		catch (Exception e)
		{
			System.out.println(e);
			System.out.printf(
					"The result of %s/%s could not be determined\n",
					input1, input2);
			e.printStackTrace();
		}	
	}
}
