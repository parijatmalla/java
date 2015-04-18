package cs520.module5.L1_structures;

import java.util.StringTokenizer;
import java.util.Stack;

import javax.swing.JOptionPane;

public class P06_StackCaseStudy {

	private static boolean isNumber(String input) {
		boolean result = false;
		try {
			Integer.parseInt(input);
			result = true;
		} catch (NumberFormatException e)
		{
		}
		return result;	
	}
	
	public static void main(String[] args) {
		
		String input = 
			JOptionPane.showInputDialog(
					"Enter Postix Expression (e.g., 2 3 * 4 5 * +)"
					);
		
		StringTokenizer st = new StringTokenizer(input);
		
		Stack<Integer> resultStack = new Stack<Integer>();
		
		while (st.hasMoreTokens()) {
			String nextInput = st.nextToken();
			if (isNumber(nextInput) == true) {
				resultStack.push(Integer.valueOf(nextInput));
				System.out.printf("Pushing %s\n", nextInput);
			} 
			else {
				// Operator -- pop the top two numbers
				Integer number2 = resultStack.pop();
				Integer number1 = resultStack.pop();
				Integer result;
				if (nextInput.equals("+"))
					result = number1 + number2;
				else if (nextInput.equals("-"))
					result = number1 - number2;
				else if (nextInput.equals("*"))
					result = number1 * number2;
				else if (nextInput.equals("/"))
					result = number1 / number2;
				else
					throw new RuntimeException("Unknown input: " + 
							nextInput);
				
				// Push the result onto the stack
				resultStack.push(result);
				System.out.printf("OP:%s, Pop %d and %d, Push %d\n",
						nextInput, number2, number1, result);
			}
			System.out.println("Stack Contents: " + resultStack);
		}
		// end of input, result is on top of the stack
		
		System.out.printf("%s = %d\n", input, resultStack.pop());
	}
}
