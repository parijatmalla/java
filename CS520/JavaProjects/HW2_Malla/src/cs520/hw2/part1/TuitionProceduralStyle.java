package cs520.hw2.part1;

import java.text.NumberFormat;

import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 * @author Parijat Malla program to get course details for two courses from user
 *         and find out tuition fee for each of them as well as display which
 *         course has higher tuition fee and the difference. this program is
 *         done in procedural programming style
 */
public class TuitionProceduralStyle {

	public static void main(String[] args) {

		// three text fields to get input for first course
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();

		// variables for first course
		String courseName1 = new String();
		int costPerCredit1 = 0;
		int numberOfCredits1 = 0;
		int tuition1 = 0;

		// variables for second course
		String courseName2 = new String();
		int costPerCredit2 = 0;
		int numberOfCredits2 = 0;
		int tuition2 = 0;
		Object[] course1 = { "Course Name", field1, "Number of Credits",
				field2, "Cost Per Unit Credit", field3 };

		// get course name, credit and cost per credit for first course from
		// user
		int option = JOptionPane.showConfirmDialog(null, course1,
				"Enter course details for first course",
				JOptionPane.OK_CANCEL_OPTION);

		// When user presses cancel, program exits
		if (option == JOptionPane.CANCEL_OPTION) {

			System.out.println("Program has been cancelled by user");
			System.exit(1);
		} else if (option == JOptionPane.OK_OPTION) {

			try {
				courseName1 = field1.getText();
				numberOfCredits1 = Integer.parseInt(field2.getText());
				costPerCredit1 = Integer.parseInt(field3.getText());

				// compute tuition fee for first course
				tuition1 = numberOfCredits1 * costPerCredit1;
			} catch (NumberFormatException e) {
				// check for invalid arguments in the user's input and exit if
				// invalid argument is entered
				System.out
						.println("Invalid arguments entered. Program terminated");
				System.exit(1);
			}

		}

		// display tuition fee for first course
		// formating tuition fee to currency format
		NumberFormat numberFormatter = NumberFormat.getCurrencyInstance();

		JOptionPane.showMessageDialog(null, "The tuition for first course "
				+ courseName1 + " is " + numberFormatter.format(tuition1));

		// get course name, credit and cost per credit from user for second
		// course
		// reinitializing same JTextField to get course name, credit and cost
		// per credit from user for second
		// course as old JTextField are no longer required
		field1 = new JTextField();
		field2 = new JTextField();
		field3 = new JTextField();

		Object[] course2 = { "Course Name", field1, "Number of Credits",
				field2, "Cost Per Credit", field3 };

		int options = JOptionPane.showConfirmDialog(null, course2,
				"Enter course details for second course",
				JOptionPane.OK_CANCEL_OPTION);
		if (options == JOptionPane.CANCEL_OPTION) {
			System.out.println("Program has been cancelled by user.");
			System.exit(1);
		} else if (options == JOptionPane.OK_OPTION) {

			try {
				courseName2 = field1.getText();
				numberOfCredits2 = Integer.parseInt(field2.getText());
				costPerCredit2 = Integer.parseInt(field3.getText());

				// compute tuition fee for second course
				tuition2 = numberOfCredits2 * costPerCredit2;
			} catch (NumberFormatException e) {
				// check for invalid arguments(when non-integers are entered for
				// no. of credits and cost per credit)
				System.out
						.println("Invalid arguments entered. Program terminated");
				System.exit(1);
			}
		}

		// display the tuition fee for second course
		// NumberFormat numberformatter2=NumberFormat.getCurrencyInstance();
		JOptionPane.showMessageDialog(null, "The tuition for second course "
				+ courseName2 + " is " + numberFormatter.format(tuition2));

		// compare the tuition for both the courses and find out which one is
		// expensive
		if (tuition1 < tuition2) {
			JOptionPane
					.showMessageDialog(
							null,
							"The tuition fee for first course "
									+ courseName1
									+ " is cheaper than second course "
									+ courseName2
									+ ". The difference in fees between these courses is "
									+ numberFormatter
											.format((tuition2 - tuition1)));
		} else if (tuition1 > tuition2) {
			JOptionPane
					.showMessageDialog(
							null,
							"The tuition fee for second course "
									+ courseName2
									+ " is cheaper than first course "
									+ courseName1
									+ ". The difference in fees between these courses is "
									+ numberFormatter
											.format((tuition1 - tuition2)));
		} else if (tuition1 == tuition2) {
			JOptionPane.showMessageDialog(null, "Both the courses "
					+ courseName1 + " and " + courseName2
					+ " have equal tuition fee.");
		}

	}

}
