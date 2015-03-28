package cs520.hw2.part2;

import javax.swing.JOptionPane;

/*
 * @author parijat malla
 * class for course that has method to compute tuition fees from user.
 * this program prints the course details and displays course details to users in console
 *
 */
public class Course {

	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;

	/*
	public Course() {
		this("Unknown course",0,1);
		System.out.println("In Course Constructor values set: ");
		System.out.println("\tCourseName = " + getCourseName()
				+ ", CostPerCredit = " + "$" + getCostPerCredit()
				+ ", NumberOfCredits = " + getNumberOfCredits());
	}

	public Course(String cName) {
		// when no of credits is not provided, consider 1 credit
		// when cost per credit is not provided consider zero cost
		this(cName, 0, 1);

		System.out.println("In Course Constructor values set: ");
		System.out.println("\tCourseName = " + getCourseName()
				+ ", CostPerCredit = " + "$" + getCostPerCredit()
				+ ", NumberOfCredits = " + getNumberOfCredits());

	}

	public Course(String cName, int cPCredit) {
		// when no of credits is not provided, consider 1 credit
		this(cName, cPCredit, 1);

		System.out.println("In Course Constructor values set: ");
		System.out.println("\tCourseName = " + getCourseName()
				+ ", CostPerCredit = " + "$" + getCostPerCredit()
				+ ", NumberOfCredits = " + getNumberOfCredits());

	}
*/
	
	//constructor with three arguments.
	public Course(String cName, int cPCredit, int noOfCredits) {

		courseName = cName;
		costPerCredit = cPCredit;
		numberOfCredits = noOfCredits;

		System.out.println("In Course Constructor values set: ");
		System.out.println("\tCourseName = " + getCourseName()
				+ ", CostPerCredit = " + "$" + getCostPerCredit()
				+ ", NumberOfCredits = " + getNumberOfCredits());

	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName
	 *            the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the costPerCredit
	 */
	public int getCostPerCredit() {

		return costPerCredit;
	}

	/**
	 * @param costPerCredit
	 *            the costPerCredit to set
	 */
	public void setCostPerCredit(int costPerCredit) {
		this.costPerCredit = costPerCredit;
	}

	/**
	 * @return the numberOfCredits
	 */
	public int getNumberOfCredits() {

		return numberOfCredits;
	}

	/**
	 * @param numberOfCredits
	 *            the numberOfCredits to set
	 */
	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public int getTotalTuition() {
		int tuition = costPerCredit * numberOfCredits;

		return tuition;
	}

	public void printTuitionDetails() {
		JOptionPane.showMessageDialog(null, "The fee for course " + courseName
				+ " is " + getTotalTuition());
	}

	public void printCourseDetails() {
		System.out.println("Course name:" + getCourseName());
		System.out.println("Cost per credit:" + getCostPerCredit());
		System.out.println("Number of credits:" + getNumberOfCredits());
	}

	public String toString() {
		String s;
		s = "Course:" + getCourseName() + "@$" + getTotalTuition();
		return s;
	}

	public static void main(String[] args) {

		Course c1 = new Course("C1", 1, 4);
		Course c2 = new Course("C2", 3, 30);
		c1.printTuitionDetails();
		c2.printTuitionDetails();
		c1.printCourseDetails();
		c2.printCourseDetails();
		System.out.println("Printing...");
		c1.toString();
		System.out.println("Printing...");
		System.out.println(c2.toString());
	}
}
