package cs520.hw5;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * @author Parijat Malla
 * Class to read homework scores for student and compute their average score
 * 
 */
public class Student {
	private String name;
	private ArrayList<Integer> homeworks;

	public Student(String name) {
		this.name = name;
		this.homeworks = new ArrayList<Integer>();
	}

	public void addHomeworkGrade(int score) {
		// add the homework score to array list
		homeworks.add(score);

	}

	public double computeAverage() {
		double result = 0;

		for (Integer score : homeworks) {
			result = result + score;
		}
		return result / homeworks.size();

	}

	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#.00");
		String sformatted = formatter.format(computeAverage());
		
		//Formatting string in the format “The <studentName>’s average grade is <the computed average>”. as per PDF instruction
		String s = "The " + name + "'s" + " average grade is " + sformatted;
		return s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
