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
	public static void main(String[] args) {
		// get input from user
		String input;
		int indexOfFirstComma = 0, indexOfSecondComma = 0;
		String courseID, courseName;
		String tuition;

		input = JOptionPane
				.showInputDialog("Please enter data using the format CourseID, CourseName, Tuition:");

		try {
			// trim the input to remove leading and trailing white spaces
			input = input.trim();
			System.out.println(input);

			// find index of first occurrence of comma
			indexOfFirstComma = input.indexOf(",");

			System.out.print("First Comma Position:" + indexOfFirstComma
					+ " , ");
			// find out course ID from input string
			courseID = input.substring(0, indexOfFirstComma);
			courseID = courseID.trim();

			// handle exception when course id is not entered
			if (courseID.length() == 0)
				throw new ZeroLengthInput("Course ID has not been entered.");
			System.out.print("Course Id:" + courseID + " , ");
			System.out.println("Length :" + courseID.length());

			// find index of second comma
			indexOfSecondComma = input.indexOf(",", indexOfFirstComma + 1);

			System.out.print("Second Comma Position:" + indexOfSecondComma
					+ " , ");

			// find out course Name from input string
			courseName = input.substring(indexOfFirstComma + 1,
					indexOfSecondComma);
			courseName = courseName.trim();

			// handle exception when course name is not entered
			if (courseName.length() == 0)
				throw new ZeroLengthInput("Course Name has not been entered.");

			System.out.print("Course Name:" + courseName + " , ");
			System.out.println("Length:" + courseName.length());
			// }
			// done = true;

			// try {
			// find out tuition from input string

			tuition = input.substring(indexOfSecondComma + 1, input.length());
			tuition = tuition.trim();
			// handle exception if tuition fee is not entered
			if (tuition.length() == 0)
				throw new ZeroLengthInput("Tuition  has not been entered.");

			// handle exception when tuition fee provided is negative
			if (Integer.parseInt(tuition) < 0)
				throw new NegativeNumberException(
						"Tuition Fee is negative number.Please enter correct tuition fee");
			System.out.print("Regular Tuition: $" + tuition + " , ");

			// trim spaces from discount
			int discount = (int) (Integer.parseInt(tuition.trim()) * 0.75);

			// display discounted tuition fee which is 75% of tuition
			System.out.println("Discounted Tuition: $" + discount);
			
		}

		// handle exception when tuition fee provided is not a number
		catch (NumberFormatException e1) {
			System.out.println(e1+" Invalid Tuition fee provided. " );
			
		}
		// Null pointer exception when user cancels and no data is feed
		catch (NullPointerException e) {

			System.out.println("The program has been cancelled." + e);
			

		}
		// handle exception when only course ID is provided
		catch (StringIndexOutOfBoundsException e) {
			System.out
					.println("Incomplete data provided.Please provide CourseID, CourseName and tuition fee."
							+ e);
			System.exit(0);
		} catch (NegativeNumberException e) {
			System.out.println(e);
		}

		catch (ZeroLengthInput e) {
			System.out.println(e);
		}

	}
}
