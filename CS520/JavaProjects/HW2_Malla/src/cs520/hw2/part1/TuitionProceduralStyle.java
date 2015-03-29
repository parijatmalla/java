package cs520.hw2.part1;

import java.text.NumberFormat;

import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 * @author Parijat Malla program to get course details for two courses from user
 *         and find out tuition fee for each of them also display which course
 *         has higher tuition fee and the difference this program is done in
 *         procedural programming style
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
				field2, "Cost Per Unit Credits", field3 };

		// get course name, credit and cost per credit for first course from
		// user
		int option = JOptionPane.showConfirmDialog(null, course1,
				"Enter course details for first course",
				JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {

			try {
				courseName1 = field1.getText();
				costPerCredit1 = Integer.parseInt(field2.getText());
				numberOfCredits1 = Integer.parseInt(field3.getText());

				// compute tuition fee for first course
				tuition1 = numberOfCredits1 * costPerCredit1;
			} catch (NumberFormatException e) {
				System.out.println("Enter all the course details");
			}

		}

		// display tuition fee for first course
		//formating tuition fee to currency format
		NumberFormat numberformatter1=NumberFormat.getCurrencyInstance();
		
		JOptionPane.showMessageDialog(null, "The tuition for first course "
				+ courseName1 + " is " + numberformatter1.format(tuition1));

		// get course name, credit and cost per credit from user for second
		// course
		JTextField field4 = new JTextField();
		JTextField field5 = new JTextField();
		JTextField field6 = new JTextField();

		Object[] course2 = { "Course Name", field4, "Credit", field5,
				"Cost Per Credit", field6 };

		int options = JOptionPane.showConfirmDialog(null, course2,
				"Enter course details for second course",
				JOptionPane.OK_CANCEL_OPTION);
		if (options == JOptionPane.OK_OPTION) {

			try {
				courseName2 = field4.getText();
				costPerCredit2 = Integer.parseInt(field5.getText());
				numberOfCredits2 = Integer.parseInt(field6.getText());

				// compute tuition fee for second course
				tuition2 = numberOfCredits2 * costPerCredit2;
			} catch (NumberFormatException e) {
				System.out.println("Enter all the details for the course");
			}
		}

		// display the tuition fee for second course
		NumberFormat numberformatter2=NumberFormat.getCurrencyInstance();
		JOptionPane.showMessageDialog(null, "The tuition for second course "
				+ courseName2 + " is " + numberformatter2.format(tuition2));

		// compare the tuition for both the courses and find out which one is
		// expensive
		if (tuition1 > tuition2) {
			JOptionPane.showMessageDialog(null, "The first course "
					+ courseName1 + " is cheaper than second course "
					+ courseName2
					+ ". The difference between these courses is "
					+ (tuition1 - tuition2));
		} else if (tuition1 < tuition2) {
			JOptionPane.showMessageDialog(null, "The first course "
					+ courseName1 + " is cheaper than second course "
					+ courseName2
					+ ". The difference between these courses is "
					+ (tuition2 - tuition1));
		} else if (tuition1 == tuition2) {
			JOptionPane
					.showMessageDialog(null, "Both the courses " + courseName1
							+ " and " + courseName2 + " have equal cost.");
		}

	}

}
