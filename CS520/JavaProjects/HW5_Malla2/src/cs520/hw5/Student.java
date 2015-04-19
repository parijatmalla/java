
/**
 * 
 */
package cs520.hw5;
import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 * @author Parijat Malla
 *
 */
public class Student {

	/**
	 * 
	 */
	
	private String name;
	private ArrayList<Integer> homeworks;
	public Student(String name) {
		this.name=name;
		homeworks=new ArrayList<Integer>();
		
		//initialize the array list and set default homework score as zero
			for(Integer i:homeworks){
				
				i=0;
			}
		
	}
	
	public void addHomeworkGrade(int score){
	//add the homework score to array list
		homeworks.add(score);
		//System.out.println("Homework added"+getName()+","+homeworks);
		
	}
	public double computeAverage(){
		double result=0;
		int counter=0;
		
		for (Integer scores: homeworks){
			result=result+scores;
		counter++;	
		}
		//System.out.println("result,count"+result+","+counter);
		return result/counter;
		
	}
	
	@Override
	public String toString(){
		DecimalFormat formatter=new DecimalFormat("#.00");
		String sformatted=formatter.format(computeAverage());
		String s="\nThe "+name+"'s"+" average grade is "+sformatted;
		return s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
