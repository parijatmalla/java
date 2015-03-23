package cs520.hw2.part1;

import javax.swing.JOptionPane;

/*
 *@author parijat malla
 * Class for a course that has methods for getting course details from user, printing course details to user,
 *  computing tuition fees and display tuition fee to user 
 */

public class Course {

	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;

	public Course() {
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

	public static void main(String[] args) {

	}
}
