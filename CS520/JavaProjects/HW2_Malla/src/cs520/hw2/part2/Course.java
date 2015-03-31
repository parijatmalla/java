package cs520.hw2.part2;

/*
 * @author parijat malla
 * This is a class for course that computes tuition fees.
 * this program prints the course details and displays course details to users in console
 *
 */
public class Course {

	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;

	// constructor with three arguments.
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

	@Override
	public String toString() {
		String s;
		s = "Course:" + getCourseName() + " @ $" + getTotalTuition()+"\n";
		return s;
	}

}
