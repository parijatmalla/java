/**
 * 
 */
package cs520.hw3.part2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;

/*
 * @author parijat malla
 * class for homework scores for students for 6 courses and get the average score.
 *
 */
public class Student {

	/**
	 * 
	 */
private String name;
private int homework1;
private int homework2;
private int homework3;
private int homework4;
private int homework5;
private int homework6;

	/**
	 * @param args
	 */

public Student(){}
public Student(String n){}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param homework1 the homework1 to set
	 */
	public void setHomework1(int homework1) {
		this.homework1 = homework1;
	}
	/**
	 * @param homework2 the homework2 to set
	 */
	public void setHomework2(int homework2) {
		this.homework2 = homework2;
	}
	/**
	 * @param homework3 the homework3 to set
	 */
	public void setHomework3(int homework3) {
		this.homework3 = homework3;
	}
	/**
	 * @param homework4 the homework4 to set
	 */
	public void setHomework4(int homework4) {
		this.homework4 = homework4;
	}
	/**
	 * @param homework5 the homework5 to set
	 */
	public void setHomework5(int homework5) {
		this.homework5 = homework5;
	}
	/**
	 * @param homework6 the homework6 to set
	 */
	public void setHomework6(int homework6) {
		this.homework6 = homework6;
	}
	
	//method to compute average score for the student
	public double computeAverage(){
		double sum=0;
		
		sum=homework1+homework2+homework3+homework4+homework5+homework6;
		return sum/6;
	} 
	
	public String toString(){
		DecimalFormat formatter=new DecimalFormat("#.00");
		String sformatted=formatter.format(computeAverage());
		String s="\n"+name+"'s"+" average grade is "+sformatted;

		
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
