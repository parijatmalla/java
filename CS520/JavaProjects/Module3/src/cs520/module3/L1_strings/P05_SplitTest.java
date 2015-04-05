package cs520.module3.L1_strings;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class P05_SplitTest {

	public static void main(String[] args) {
		String input = 
			JOptionPane.showInputDialog("Enter comma separated data:");
		// Tokenize using the comma delimiters
		String delimiter = ",";
		String[] tokens = input.split(delimiter);
		
		
		System.out.printf("Total Tokens = %d\n", 
				tokens.length);
		
		// Iterate over the tokens
		for (int index = 0; index < tokens.length; index++)
		{
			System.out.printf("Token %d:%s:\n",index, tokens[index]);
		}
	}

}
