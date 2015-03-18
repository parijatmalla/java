package cs520.module1.L3_controlStructures;

/*
  Demonstrates the if-else conditional statement.
  Simulates the rolling of two dice. If the face values of 
  the two are equal, or if one value is twice the other,
  it is considered a jackpot. The program keeps track of the
  total number of jackpots and the total number of tries.
*/

import javax.swing.*;

public class P03_PairOfDice 
{
		public static void rollDice() 
		{
			int face1, face2;
			String result;
			
			// Generate a random value for the first dice
			face1 = 1 + (int) ( Math.random() * 6 );		
			// Generate a random value for the second dice
			face2 = 1 + (int) ( Math.random() * 6 );		
			
			result = "[" + face1 + "][" + face2 + "]";
									
			// Check if this is a jackpot
			if ((face1 == face2) || 
					(face1 == 2 * face2) || 
					(face2 == 2 * face1)) 
			{		
				result = result + " Jackpot!! You are lucky";
			}
			else 
			{
				result = result + " Better luck next time!!";
			}
			
			JOptionPane.showMessageDialog(null, result);
		}
			
		public static void main(String[] args)
		{
			// Invoke the method
			rollDice();		
			
		}
	}
