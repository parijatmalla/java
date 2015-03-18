package cs520.module1.L3_controlStructures;

/*
  Demonstrates the if-else conditional statement
  Based upon the age of the person, 
  eligibility to vote is determined.
  If the person is not eligible, the years remaining 
  for eligibility is displayed	
 */

import javax.swing.*;

public class P02_IfElseAgeTest 
{
	public static void checkVotingAge(int age) 
	{
		boolean canVote;
		int waitFor = 0;
		
		if (age >= 18) {
			canVote = true;
		}
		else {
			canVote = false;
			waitFor = 18 - age;
		}
		
		if (canVote) {
			JOptionPane.showMessageDialog(null, 
					"You can vote!");
		} else {
			JOptionPane.showMessageDialog(null, 
				"Sorry, you can't vote!\n Try again in " + 
				waitFor + " years");
		}	
	}

	public static void main(String[] args)	
	{
		String input = JOptionPane.showInputDialog("Enter your age:");
		// parse the string input to an integer
		int age = Integer.parseInt(input);		
		
		// invoke the method
		checkVotingAge(age);		
		
	}	
}
