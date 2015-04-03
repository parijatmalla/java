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
 * @author parijat malla program to read content from a file for student's
 *         record and print average score for each student
 * 
 */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void processInputData(String st) {
		StringTokenizer st1 = new StringTokenizer(st, ",");
		String token;
		int i = 1;
		Student currentStudent = new Student();

		while (st1.hasMoreTokens()) {
			token = st1.nextToken();

			switch (i) {
			case 1:

				currentStudent.setName(token);
				i++;
				break;
			case 2:
				currentStudent.setHomework1(Integer.parseInt(token));
				i++;
				break;
			case 3:
				currentStudent.setHomework2(Integer.parseInt(token));
				i++;
				break;
			case 4:
				currentStudent.setHomework3(Integer.parseInt(token));
				i++;
				break;
			case 5:
				currentStudent.setHomework4(Integer.parseInt(token));
				i++;
				break;
			case 6:
				currentStudent.setHomework5(Integer.parseInt(token));
				i++;
				break;
			case 7:
				currentStudent.setHomework6(Integer.parseInt(token));
				i++;
				break;
			}
			// System.out.println("token-i"+token+","+i);

		}

		System.out.printf(currentStudent.toString());
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
			
		}
		catch(FileNotFoundException e){
			System.out.println(e+"File not found in provided location");
			System.exit(0);
		}

		try{
			line = inputStream.readLine();
			while (line != null) {

				// System.out.println(line);
				processInputData(line);
				line = inputStream.readLine();
				// line=inputStream.readLine();
				// System.out.println("in readline");

			}

		}

		catch (IOException e) {
			System.out.println("End of file");
		} catch (NumberFormatException e) {
			System.out.println(e + "Invalid number format provided");
		}

		finally {
			inputStream.close();
		}
	}
}
