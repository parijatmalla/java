package cs520.hw5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Test {

	public Test() {

	}

	//processInputData method to read data from file and get the homework scores for a student.
	private static Student processInputData(String st) {
		StringTokenizer st1 = new StringTokenizer(st, ",");
		String name=st1.nextToken();
		Student currentStudent = new Student(name);

		int numberOfTokens = st1.countTokens();
		// add howework scores from file into Student object
		while(st1.hasMoreTokens()){

			currentStudent.addHomeworkGrade(Integer.parseInt(st1.nextToken()));

		}

		System.out.printf(currentStudent.toString());
		return currentStudent;
	}

	public static void main(String[] args) throws IOException {
		LinkedList<Student> studentQueue;
		// Create an empty queue
		studentQueue = new LinkedList<Student>();

		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		
	
		

		// read input from file data.txt
		BufferedReader inputStream = null;
		String line = "";
		
		Student aStudent;

		try {
			inputStream = new BufferedReader(new FileReader("data.txt"));

		} catch (FileNotFoundException e) {
			System.out.println(e + "File not found in provided location");
			System.exit(0);
		}

		try {
			line = inputStream.readLine();
			System.out.print("Input file processing...");
			while (line != null) {

				
				aStudent=processInputData(line);
				//adding each student to studentQueue
				studentQueue.add(aStudent);
				
				//adding student object to student map
				studentMap.put(aStudent.getName(), aStudent);
				line = inputStream.readLine();

			}
			Iterator<Student> studentIterator=studentQueue.iterator();
			System.out.print("\n\nIterating over the student list...");
			while(studentIterator.hasNext()){
				
				System.out.print(studentIterator.next());
				
			}
			
			//access all the keys in the map
			Set<String> studentKeys=studentMap.keySet();
			
			//iterator over each key of studentMap 
			Iterator<String> studentIterator2=studentKeys.iterator();
			System.out.print("\n\nIterating over the student map...");
			while(studentIterator2.hasNext()){
				String name=studentIterator2.next();
				System.out.print(studentMap.get(name));
			}
			
			

		}

		catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e + "Invalid number format provided");
		}

		finally {
			inputStream.close();
		}
		
		

	}

}
