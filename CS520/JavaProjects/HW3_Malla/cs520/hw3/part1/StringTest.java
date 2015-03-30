/**
 * 
 */
package cs520.hw3.part1;

import javax.swing.JOptionPane;

/*
 * @author parijat malla
 *
 *program to get course id ,coursename and tuition fee from user
 *apply string trim to display courseID, course name, tuition fee and discounted tuition fee and the position of comma's in user's input
 *also handle the exceptions for different cases
 */
public class StringTest {

	/**
	 * 
	 */

	public StringTest() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// get input from user
		String input;

		String courseID, courseName;
		String tuition;

		// flag to check for completion
		boolean done = false;

		while (!done) {

			
			input = JOptionPane
					.showInputDialog("Please enter data using the format CourseID, CourseName, Tuition:");

			if(input==null)
			{
				System.out.println("Program has been cancelled");
				System.exit(1);
				
			}
			
			else {
			// trim the input to remove leading and trailing white spaces
			input = input.trim();

			// display trimmed input
			System.out.println("Trimmed input:" + input);

			int indexOfFirstComma = 0, indexOfSecondComma = 0;

			
			//handle exception when only course ID is provided
			try {
				// find index of first occurrence of comma
				indexOfFirstComma = input.indexOf(",");
				System.out.print("First Comma Position:" + indexOfFirstComma
						+ " , ");
				// find out course ID from input string
				courseID = input.substring(0, indexOfFirstComma);
				System.out.print("Course Id:" + courseID + " , ");
				System.out.println("Length :" + courseID.length());
				//done = true;
			} catch (StringIndexOutOfBoundsException e) {
				System.out
						.println("Course Name and tuition are not provided. Please try again!");
			//	System.exit(0);
				break;

			}

			
			//handle exception when only courseID and course name is provided but tuition is not provided
			try {
				// find index of second comma
				indexOfSecondComma = input.indexOf(",", indexOfFirstComma + 1);
				System.out.print("Second Comma Position:" + indexOfSecondComma
						+ " , ");

				// find out course Name from input string
				courseName = input.substring(indexOfFirstComma + 1,
						indexOfSecondComma);
				System.out.print("Course Name:" + courseName + " , ");
				System.out.println("Length:" + courseName.length());
				done = true;

			} catch (StringIndexOutOfBoundsException e) {
				System.out
						.println("Tuition is not provided. Please try again!");
				System.exit(0);
			}

			
			//handle exception when tuition fee provided is not a number
			try {
				// find out tuition from input string
				tuition = input.substring(indexOfSecondComma + 1,
						input.length());
				System.out.print("Regular Tuition: $" + tuition + " , ");

				// trim spaces from discount
				int discount = Integer.parseInt(tuition.trim());
				discount = (int) (discount * 0.75);

				// display discounted tuition fee which is 75% of tuition
				System.out.println("Discounted Tuition: $" + discount);
				done = true;
			} catch (NumberFormatException e) {
				
				
				System.out
						.println("Tuition fee provided is not a whole number. Please try again!");
				System.exit(1);

			}
			
			
		}
	}
}
}
