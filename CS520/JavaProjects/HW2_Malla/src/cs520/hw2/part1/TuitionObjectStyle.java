/**
 * 
 */
package cs520.hw2.part1;

import java.text.NumberFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * @author Parijat Malla 
 * 		   program to write TuitionProcedure in object oriented
 *         style. this program gets two course details from user, computes the
 *         tuition fee for each using the class Course and compares their fees.
 *         also the program displays which course has higher fee including the
 *         difference
 */
public class TuitionObjectStyle {

	/**
	 * 
	 */
	public TuitionObjectStyle() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Course c1 = new Course();
		Course c2 = new Course();

		// get input from user
		// for first course

		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();

		Object[] course1 = { "Course Name", field1, "Number of Credits",
				field2, "Cost Per Unit Credits", field3 };

		// get course name, credit and cost per credit for first course from
		// user
		int option = JOptionPane.showConfirmDialog(null, course1,
				"Enter course details for first course",
				JOptionPane.OK_CANCEL_OPTION);

		// When user presses cancel, program exits
		if (option == JOptionPane.CANCEL_OPTION) {
			System.out.println("Program has been cancelled by user.");
			System.exit(1);
		} else if (option == JOptionPane.OK_OPTION) {

			try {
				// set the course details for first course

				c1.setCourseName(field1.getText());
				c1.setNumberOfCredits(Integer.parseInt(field2.getText()));
				c1.setCostPerCredit(Integer.parseInt(field3.getText()));

				// print course name and the tuition fee for first courses

				c1.printTuitionDetails();

			} catch (NumberFormatException e) {

				// when input from user are not valid(non integers entered in
				// no. of credits and cost per credit), program is terminated
				System.out
						.println("Invalid arguments entered. Program terminated");
				System.exit(1);
			}

		}

		// reinitializing same JTextField to get course name, credit and cost
		// per credit from user for second
		// course as old JTextField are no longer required
		field1 = new JTextField();
		field2 = new JTextField();
		field3 = new JTextField();

		Object[] course2 = { "Course Name", field1, "Number of Credits",
				field2, "Cost Per Credit", field3 };
		// get course name, credit and cost per credit for second course from
		// user
		int options = JOptionPane.showConfirmDialog(null, course2,
				"Enter course details for second course",
				JOptionPane.OK_CANCEL_OPTION);
		if (options == JOptionPane.CANCEL_OPTION) {
			System.out.println("Program has been cancelled by user");
			System.exit(1);
		} else if (options == JOptionPane.OK_OPTION) {
			try {
				// set course details for second course
				c2.setCourseName(field1.getText());
				c2.setNumberOfCredits(Integer.parseInt(field2.getText()));
				c2.setCostPerCredit(Integer.parseInt(field3.getText()));

				// print course name and the tuition fee for second courses
				c2.printTuitionDetails();

			} catch (NumberFormatException e) {
				System.out
						.println("Invalid arguments entered.Program terminated");
				System.exit(1);
			}

		}

		NumberFormat formattedno = NumberFormat.getCurrencyInstance();
		if (c1.getTotalTuition() > c2.getTotalTuition()) {
			JOptionPane
					.showMessageDialog(
							null,
							"The fee for first course "
									+ c1.getCourseName()
									+ " is higher than second course "
									+ c2.getCourseName()
									+ ". The difference in fee between these courses is "
									+ formattedno.format((c1.getTotalTuition() - c2
											.getTotalTuition())));
		} else if (c1.getTotalTuition() < c2.getTotalTuition()) {
			JOptionPane
					.showMessageDialog(
							null,
							"The fee for second course "
									+ c2.getCourseName()
									+ " is higher than first course "
									+ c1.getCourseName()
									+ ". The difference in fee between these courses is "
									+ formattedno.format((c2.getTotalTuition() - c1
											.getTotalTuition())));
		} else if (c1.getTotalTuition() == c2.getTotalTuition()) {
			JOptionPane.showMessageDialog(null, "The fee for both the courses "
					+ c2.getCourseName() + " and " + c2.getCourseName()
					+ " are equal");

		}
	}

}
