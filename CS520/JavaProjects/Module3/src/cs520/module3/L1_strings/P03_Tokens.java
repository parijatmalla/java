package cs520.module3.L1_strings;

import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class P03_Tokens {

	public static void main(String[] args) {
	
		String input = 
			JOptionPane.showInputDialog("Enter comma separated data:");
		// Tokenize using the comma delimiters
		String delimiter = ",";
		StringTokenizer st = 
			new StringTokenizer(input, delimiter);
		
		System.out.printf("Total Tokens = %d\n", 
				st.countTokens());
		
		// Iterate over the tokens
		while (st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.printf("Token:%s\n",token);
		}
	}
}
