package cs520.hw5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Test {

	public Test() {

	}

	// processInputData method to read data from file and get the homework
	// scores for a student.
	private static Student processInputData(String st) {
		StringTokenizer st1 = new StringTokenizer(st, ",");
		String name = st1.nextToken();
		Student currentStudent = new Student(name);

		// add homework scores from file into Student object
		while (st1.hasMoreTokens()) {
			currentStudent.addHomeworkGrade(Integer.parseInt(st1.nextToken()));
		}

		System.out.println(currentStudent.toString());
		return currentStudent;
	}

	public static void main(String[] args) {
		// Create an empty queue
		LinkedList<Student> studentQueue = new LinkedList<Student>();

		HashMap<String, Student> studentMap = new HashMap<String, Student>();

		// read input from file data.txt
		BufferedReader inputStream = null;
		String line;

		try {
			inputStream = new BufferedReader(new FileReader("data.txt"));
			line = inputStream.readLine();
			System.out.println("Input file processing...");
			while (line != null) {

				Student aStudent = processInputData(line);
				// adding each student to studentQueue
				studentQueue.add(aStudent);

				// adding student object to student map
				studentMap.put(aStudent.getName(), aStudent);
				line = inputStream.readLine();

			}
			inputStream.close();

			System.out.println("\nIterating over the student list...");
			for (Student studentObj : studentQueue) {
				System.out.println(studentObj.toString());
			}

			// access all the keys in the map
			Set<String> studentKeys = studentMap.keySet();

			// iterator over each key of studentMap
			Iterator<String> studentIterator = studentKeys.iterator();
			System.out.println("\nIterating over the student map...");
			while (studentIterator.hasNext()) {
				String name = studentIterator.next();
				System.out.println((studentMap.get(name)).toString());
			}

		} catch (FileNotFoundException e) {
			System.out.println(e + "File not found in provided location");
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e + "Invalid number format provided");
		}

	}

}
