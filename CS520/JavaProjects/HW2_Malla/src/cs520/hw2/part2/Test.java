/**
 * 
 */
package cs520.hw2.part2;

/*
 * @author parijat malla
 * program to create objects for Course and OnlineCourse.
 * This program displays the course details for a course as well as online course and tests classes Course.java and OnlineCourse.java
 */
public class Test {

	
	public Test() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Taking a regular course...");

		// creating an object for course CS520
		Course currentCourse = new Course("CS520", 390, 4);

		// printing course details
		System.out.println("Printing...");
		System.out.println(currentCourse.toString());
	
		System.out.println("Taking an online course...");

		// creating an object for online course CS520
		OnlineCourse currentOnlineCourse = new OnlineCourse("CS520", 760, 4, 60);
		currentCourse = currentOnlineCourse;

		// printing online course details
		System.out.println("Printing...");
		System.out.println(currentCourse.toString());

	}

}
