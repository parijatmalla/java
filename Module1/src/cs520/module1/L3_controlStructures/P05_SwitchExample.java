package cs520.module1.L3_controlStructures;

import javax.swing.JOptionPane;

public class P05_SwitchExample {

	public static String dayToString(int day) 
	{
		String result;
	        switch (day) {
	          case 1: 
	            result = "Monday";
	            break;
	          case 2: 
	            result = "Tuesday";
	            break;
	          case 3: 
	            result = "Wednesday";
	            break;
	          case 4: 
	            result = "Thursday";
	            break;
	          case 5: 
	            result = "Friday";
	            break;
	          case 6: 
	            result = "Saturday";
	            break;
	          case 7: 
	            result = "Sunday";
	            break;
	          default: 
	            result = "Error";
	            break;
	        }
        return result;
	}
	
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog(
				"Enter day (1 - 7):");
		// parse the string input to an integer
		int day = Integer.parseInt(input);		
		
		// invoke the method
		String value = dayToString(day);		
		
		// Display the result
		JOptionPane.showMessageDialog(null, 
				"It is " + value); 
	}

}
