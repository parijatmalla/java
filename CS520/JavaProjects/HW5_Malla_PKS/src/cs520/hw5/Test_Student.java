/**
 * Test Class to test Student class
 */
package cs520.hw5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import java.util.StringTokenizer;

/**
 * @author Parijat Malla
 *
 */
import cs520.hw5.Student;

public class Test_Student {
	private static ArrayList<Student> studentQueue = new ArrayList<Student>();
	private static HashMap<String, Student> studentMap = new HashMap<String, Student>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Use the BufferedReader class to read the data.txt file. The contents
		// of the file are shown below. Create the data.txt file in
		// HW5_lastName.
		String dataFile = "data.txt";
		try {
			// Read the contents of the text file one line at a time using a
			// loop.
			// The program should work for any number of input lines. In this
			BufferedReader inputStream = new BufferedReader(new FileReader(
					dataFile));

			String line = inputStream.readLine();
			
			System.out.println("\nInput file " + dataFile +" processing...");
			while (line != null) {
				// Invoke the processInputData method for each line read. This
				// method returns the corresponding Student object.
				Student newStudent = processInputData(line);
				// Add this Student object to the studentQueue.
				studentQueue.add(newStudent);
				// Insert this Student object into the studentMap using the
				// student’s name as the key.
				studentMap.put(newStudent.getName(), newStudent);
				line = inputStream.readLine();
			}
			// close the stream
			inputStream.close();
			// After the loop is processed, do the following.
			// 1. Iterate over the studentQueue and display each element to
			// the console.
			// iterate via "New way to loop"
			System.out.println("\nIterating over the student list...");
			for (Student objStudent : studentQueue) {
				System.out.println(objStudent);
			}
			// Access the keys of the studentMap and assign them to an
			// appropriate variable.
			Set<String> studentKeys = studentMap.keySet();

			// Create an iterator over the keys. Iterate
			// over each key in this set and display the associated object in
			// the map to the console.
			// create a iterated from student keys and loop
			System.out.println("\nIterating over the student map...");
			Iterator<String> studentKeysIterator = studentKeys.iterator();
			while (studentKeysIterator.hasNext()) {
				System.out.println(studentMap.get(studentKeysIterator.next()));
			}

		} catch (FileNotFoundException e) {
			System.out.println("File" + dataFile + " not found");
			System.out.println("or could not be opened.");
		} catch (IOException e) {
			System.out.println("Error reading from " + dataFile + ".");
		}
	}

	/**
	 * @param line
	 * @return Student
	 */
	private static Student processInputData(String line) {
		/*
		 * 1. Tokenize the string argument using the StringTokenizer class using
		 * the comma as the delimiter, or using the String split method. 2.
		 * Extract the name token. Create a Student object and assign to the
		 * local variable currentStudent. 3. Using a while loop, read the next
		 * homework grade token. Use the addHomeworkGrade method on the student
		 * object to add the homework grade for this homework. 4. Display the
		 * string representation of the currentStudent object to the console. 5.
		 * The method should return the currentStudent object.
		 */
		StringTokenizer stringTokenizer = new StringTokenizer("a;b;c;d");
		System.out.println("StringToken count:" +stringTokenizer.countTokens());
		System.out.println("string revers" +new StringBuffer("abcd").reverse().substring(1, 2));
		String s1="long string";
		String s2="shortstr";
		String s3 = s1 + s2;
		//char c = s1.substring(0,1);
		s2 = s1.replace('s', 's');
		s1 = s2.substring(s1.length());
		System.out.println("s1:" +s1 +"   "+"s2:" +s2);
		
		
		String currentStudentName = stringTokenizer.nextToken();
		Student currentStudent = new Student(currentStudentName);
		while (stringTokenizer.hasMoreTokens()) {
			currentStudent.addHomeworkGrade(Integer.valueOf(stringTokenizer
					.nextToken()));
		}
		System.out.println(currentStudent);
		return currentStudent;
	}
}
