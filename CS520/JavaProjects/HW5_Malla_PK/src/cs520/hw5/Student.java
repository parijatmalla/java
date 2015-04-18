package cs520.hw5;

import java.util.ArrayList;

/**
 * The class keeps track of thestudent’s homework grades.
 */

/**
 * @author Parijat Malla
 * 
 */
/**
 * @author oracle
 * 
 */
public class Student {
	private String name;
	private ArrayList<Integer> homeworks;

	public Student(String name) {
		// set the name for the instance with one provided
		this.setName(name);
		// initialize the homeworks arraylist
		homeworks = new ArrayList<Integer>();
	}

	/**
	 * @param grade
	 *            A void addHomeworkGrade method which takes one argument – the
	 *            new homework grade.
	 */
	public void addHomeworkGrade(int grade) {
		homeworks.add(grade);
	}

	/**
	 * @return
	 * 
	 *         method which takes no arguments and returns a double showing the
	 *         average homework grade for this student.
	 */
	public double computeAverage() {
		double averageGrade;
		double sumAllGrades = 0;
		double countGrades = 0;
		countGrades = homeworks.size();
		for (int gradeItem : homeworks) {
			sumAllGrades += gradeItem;
		}
		averageGrade = sumAllGrades / countGrades;
		return averageGrade;
	}

	@Override
	public String toString() {
		return "The " + name + "'s average grade is " + computeAverage();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
