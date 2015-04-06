/**
 * 
 */
package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author parijat malla
 *  program to read content from a file for student's
 *         record and print average score for each student
 * 
 */
public class Test {

	public Test() {

	}

	//processInputData is private method. It's made static as this method can be called only within this class.
	private static void processInputData(String st) {
		StringTokenizer st1 = new StringTokenizer(st, ",");

		// check if all the homework scores and name are provided in the input
		// file
		// if all the fields are not provided, it exits.
		if (st1.countTokens() < 7) {
			System.out
					.println("All the required data fields are not provided in the input file");
			System.exit(0);
		} else {
			Student currentStudent = new Student();

			
				currentStudent.setName(st1.nextToken());
				currentStudent.setHomework1(Integer.parseInt(st1.nextToken()));
				currentStudent.setHomework2(Integer.parseInt(st1.nextToken()));
				currentStudent.setHomework3(Integer.parseInt(st1.nextToken()));

				currentStudent.setHomework4(Integer.parseInt(st1.nextToken()));

				currentStudent.setHomework5(Integer.parseInt(st1.nextToken()));

				currentStudent.setHomework6(Integer.parseInt(st1.nextToken()));

			
			System.out.printf(currentStudent.toString());

		}
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		

		// read input from file data.txt
		BufferedReader inputStream = null;
		String line = "";

		try {
			inputStream = new BufferedReader(new FileReader("data.txt"));
			// System.out.println("buffered");

		} catch (FileNotFoundException e) {
			System.out.println(e + "File not found in provided location");
			System.exit(0);
		}

		try {
			line = inputStream.readLine();
			while (line != null) {

				// System.out.println(line);
				processInputData(line);
				line = inputStream.readLine();
			

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
