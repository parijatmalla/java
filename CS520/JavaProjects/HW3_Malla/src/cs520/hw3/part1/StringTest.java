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

	public StringTest() {

	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// get input from user
		String input;
		int indexOfFirstComma = 0, indexOfSecondComma = 0;
		String courseID, courseName;
		String tuition;

		// flag to check for completion
		// boolean done = false;

		// while (!done) {

		input = JOptionPane
				.showInputDialog("Please enter data using the format CourseID, CourseName, Tuition:");

		// when user presses cancel
		if (input == null) {
			System.out.println("Program has been cancelled");
			System.exit(1);

		}

		else {

			// handle exception when only course ID is provided
			try {
				// trim the input to remove leading and trailing white spaces
				input = input.trim();

				// find index of first occurrence of comma
				indexOfFirstComma = input.indexOf(",");

				// handle exception when user presses Ok with no data input
				if (input.length() <= 0)
					throw new Exception(
							"No data has been entered. Program terminated");
				else {
					// display trimmed input
					System.out.println( input);
				}

				// handle exception when no comma separated data is input
				if (indexOfFirstComma == -1)
					throw new Exception(
							"No Course Name and tuition fee is not provided.");
				else {
					System.out.print("First Comma Position:"
							+ indexOfFirstComma + " , ");
					// find out course ID from input string
					courseID = input.substring(0, indexOfFirstComma);
					if (courseID.length() <= 0)
						throw new Exception("Enter valid Course ID");
					else {
						System.out.print("Course Id:" + courseID + " , ");
						System.out.println("Length :" + courseID.length());
					}
				}
				// done = true;

				// handle exception when only courseID and course name is
				// provided
				// but tuition is not provided
				// try {
				// find index of second comma
				indexOfSecondComma = input.indexOf(",", indexOfFirstComma + 1);

				// handle exception when only course id is provided
				if (indexOfSecondComma == -1)
					throw new Exception(
							"No course name and tuition is provided. Program terminated");
				else
					System.out.print("Second Comma Position:"
							+ indexOfSecondComma + " , ");

				// find out course Name from input string
				courseName = input.substring(indexOfFirstComma + 1,
						indexOfSecondComma);

				if (courseName.length() <= 0)
					throw new Exception(
							"Enter valid Course Name. Please try again!");
				else {
					System.out.print("Course Name:" + courseName + " , ");
					System.out.println("Length:" + courseName.length());
					// }
					// done = true;

				}

				// handle exception when tuition fee provided is not a number
				// try {
				// find out tuition from input string

				tuition = input.substring(indexOfSecondComma + 1,
						input.length());

				System.out.print("Regular Tuition: $" + tuition + " , ");

				// trim spaces from discount
				int discount = Integer.parseInt(tuition.trim());
				discount = (int) (discount * 0.75);

				// display discounted tuition fee which is 75% of tuition
				System.out.println("Discounted Tuition: $" + discount);
				// done = true;
			} catch (Exception thrownObject) {

				System.out.println(thrownObject.getMessage());
				System.exit(0);

			}
			

		}
	}
}
