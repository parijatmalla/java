/**
 * 
 */
package cs520.hw2.part2;

/*
 * @author parijat malla
 * this is a class derived from Course for online courses.
 * this gets course details and computes total tuition fee including technology fee.
 * the total tuition fee and course details are displayed to user.
 *
 */
public class OnlineCourse extends Course {

	private int technologyFee;

	/**
	 * @param cName
	 * @param cPCredit
	 * @param noOfCredits
	 */

	// constructor with four arguments
	public OnlineCourse(String cName, int cPCredit, int noOfCredits, int techFee) {

		super(cName, cPCredit, noOfCredits);
		this.setTechnologyFee(techFee);

		System.out.println("In OnlineCourse Constructor values set: ");
		System.out.println("\tCourseName = " + getCourseName()
				+ ", CostPerCredit = " + "$" + getCostPerCredit()
				+ ", NumberOfCredits = " + getNumberOfCredits()
				+ ", Technology Fee = $" + getTechnologyFee());

	}

	@Override
	public int getTotalTuition() {
		// compute tuition from super class Course and add technology fee to
		// online course
		return super.getTotalTuition() + technologyFee * getNumberOfCredits();
	}

	// method to return the string as Online course <course name> @$<tuition
	// fee>
	@Override
	public String toString() {
		String s;
		s = "OnlineCourse:" + getCourseName() + " @ $" + getTotalTuition()+"\n";
		return s;
	}

	/**
	 * @return the technologyFee
	 */
	public int getTechnologyFee() {
		return technologyFee;
	}

	/**
	 * @param technologyFee
	 *            the technologyFee to set
	 */
	public void setTechnologyFee(int technologyFee) {
		this.technologyFee = technologyFee;
	}

}
