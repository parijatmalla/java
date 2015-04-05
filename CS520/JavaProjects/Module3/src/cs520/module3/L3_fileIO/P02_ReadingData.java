package cs520.module3.L3_fileIO;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class P02_ReadingData {
	
	public static void main(String[] args)
	{
		String inputFileName = "data.txt";
		FileReader fileReader = null;
		// Create the FileReader object
		try {
			fileReader = new FileReader(inputFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		// Read one line at a time until end of file
		try {
			input = reader.readLine();
			while (input != null)
			{
				processInputData(input);
				input = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Close the input
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void processInputData(String data)
	{
		StringTokenizer st = new StringTokenizer(data, ",");
		String id 		= st.nextToken();
		String name 	= st.nextToken();
		String salary 	= st.nextToken();
		Employee currentEmployee = 
			new Employee(id, name, Integer.parseInt(salary));
		System.out.println(currentEmployee.displayInfo());
	}
}
