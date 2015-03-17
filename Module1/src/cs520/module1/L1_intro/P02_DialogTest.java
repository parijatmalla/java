package cs520.module1.L1_intro;

// Dialog Input and Output

import javax.swing.JOptionPane;

public class P02_DialogTest 
{
	public static void main(String[] args)
	{
		String input, output;
		
		int age, newAge;
		
		input = JOptionPane.showInputDialog("Please enter your age:");
		
		age 	= Integer.parseInt(input);
		newAge 	= age + 10;
		
		output = "You will be " + newAge + " in 10 years from now!";
		
		JOptionPane.showMessageDialog(null, output);
	}
}
