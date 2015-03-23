/**
 * 
 */
package cs520.hw2.part1;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * @author Parijat Malla 
 * 		   program to write TuitionProcedure in object oriented
 *         style. this program gets course details from user, computes the
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

		Course c1;
		Course c2;

		// get input from user
		// for first course
		String courseName1 = new String();
		int costPerCredit1 = 0;
		int numberOfCredits1 = 0;

		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();

		// for second course
		String courseName2 = new String();
		int costPerCredit2 = 0;
		int numberOfCredits2 = 0;

		Object[] course1 = { "Course Name", field1, "Number of Credits",
				field2, "Cost Per Unit Credits", field3 };

		// get course name, credit and cost per credit for first course from
		// user
		int option = JOptionPane.showConfirmDialog(null, course1,
				"Enter course details for first course",
				JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {

			courseName1 = field1.getText();
			costPerCredit1 = Integer.parseInt(field2.getText());
			numberOfCredits1 = Integer.parseInt(field3.getText());

		}

		c1 = new Course();

		// set the course details for first course
		c1.setCostPerCredit(costPerCredit1);
		c1.setCourseName(courseName1);
		c1.setNumberOfCredits(numberOfCredits1);

		// print course name and the tuition fee for first courses

		c1.printTuitionDetails();

		// get course name, credit and cost per credit from user for second
		// course
		JTextField field4 = new JTextField();
		JTextField field5 = new JTextField();
		JTextField field6 = new JTextField();

		Object[] course2 = { "Course Name", field4, "Credit", field5,
				"Cost Per Credit", field6 };
		// get course name, credit and cost per credit for second course from
		// user
		int options = JOptionPane.showConfirmDialog(null, course2,
				"Enter course details for second course",
				JOptionPane.OK_CANCEL_OPTION);
		if (options == JOptionPane.OK_OPTION) {
			courseName2 = field4.getText();
			costPerCredit2 = Integer.parseInt(field5.getText());
			numberOfCredits2 = Integer.parseInt(field6.getText());

		}

		c2 = new Course();

		// set the course details for second course
		c2.setCostPerCredit(costPerCredit2);
		c2.setCourseName(courseName2);
		c2.setNumberOfCredits(numberOfCredits2);

		// print course name and the tuition fee for second courses
		c2.printTuitionDetails();

		if (c1.getTotalTuition() > c2.getTotalTuition()) {
			JOptionPane
					.showMessageDialog(
							null,
							"The fee for first course "
									+ c1.getCourseName()
									+ " is higher than second course "
									+ c2.getCourseName()
									+ ". The difference in fee between these courses is "
									+ (c1.getTotalTuition() - c2
											.getTotalTuition()));
		} else if (c1.getTotalTuition() < c2.getTotalTuition()) {
			JOptionPane
					.showMessageDialog(
							null,
							"The fee for second course "
									+ c2.getCourseName()
									+ " is higher than first course "
									+ c1.getCourseName()
									+ ". The difference in fee between these courses is "
									+ (c2.getTotalTuition() - c1
											.getTotalTuition()));
		} else if (c1.getTotalTuition() == c2.getTotalTuition()) {
			JOptionPane.showMessageDialog(null, "The fee for both the courses "
					+ c2.getCourseName() + " and " + c2.getCourseName()
					+ " are equal");

		}
	}

}
