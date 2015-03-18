package cs520.module1.L3_controlStructures;

/*
  Demonstrates the if conditional statement
  Based upon the age of the person, 
  eligibility to vote is determined.
 */

import javax.swing.*;

public class P01_IfAgeTest 
{
	public static void checkVotingAge(int age) 
	{
		boolean canVote = false;
		
		if (age >= 18) {
			canVote = true;
		}
		
		JOptionPane.showMessageDialog(null, 
			"Can Vote? " + canVote);
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
