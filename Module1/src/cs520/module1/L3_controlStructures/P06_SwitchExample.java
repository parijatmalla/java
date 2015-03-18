package cs520.module1.L3_controlStructures;

import javax.swing.JOptionPane;

public class P06_SwitchExample {

	public static int stringToDay(String value) 
	{ 
		int result;
	        switch (value) {
	          case "Monday": 
	            result = 1;
	            break;
	          case "Tuesday": 
	            result = 2;
	            break;
	          case "Wednesday": 
	            result = 3;
	            break;
	          case "Thursday": 
	            result = 4;
	            break;
	          case "Friday": 
	            result = 5;
	            break;
	          case "Saturday": 
	            result = 6;
	            break;
	          case "Sunday": 
	            result = 7;
	            break;
	          default: 
	            result = -1;
	            break;
	        }
        return result;
	}
	
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog(
				"Enter day:");
		
		// invoke the method
		int value = stringToDay(input);		
		
		// Display the result
		JOptionPane.showMessageDialog(null, "Day " + value); 
	}

}
