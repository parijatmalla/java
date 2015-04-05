package cs520.module3.L1_strings;

import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class P02_TokensWrongVersion {

	public static void main(String[] args) {
	
		String input = 
			JOptionPane.showInputDialog("Type a sentence:");
		// Tokenize using the default delimiters
		StringTokenizer st = 
			new StringTokenizer(input);

		System.out.printf("Total Tokens = %d\n", 
				st.countTokens());
		
		// Iterate over the tokens
		for (int i = 0; i < st.countTokens(); i++)
		{
			String token = st.nextToken();
			System.out.printf("Token:%s\n",token);
			System.out.printf("Remaining Tokens = %d\n", 
					st.countTokens());
		}
	}
}
