package cs520.module3.L3_fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class P01_WritingData {
	
	public static void main(String[] args)
	{
		String outputFileName = "data.txt";
		PrintWriter writer = null;
		// Create the PrintWriter object
		try {
			writer = new PrintWriter(outputFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Write one line at a time to the file
		String data;
		data = "1,Alice,50000";
		writer.println(data);
	
		data = "2,Bob,51000";
		writer.println(data);
		
		data = "3,Charlie,52000";
		writer.println(data);
		
		data = "4,Dave,53000";
		writer.println(data);
		
		data = "5,Ed,54000";
		writer.println(data);
	    // Close the output
		writer.close();
		System.out.printf("Data file %s written\n", outputFileName);
	}	
}
