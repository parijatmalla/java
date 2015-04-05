package cs520.module3.L3_fileIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P03_WritingPrimitiveData {
	
	public static void main(String[] args)
	{
		String outputFileName = "salaries.data";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outputFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Create the DataOutputStream
		DataOutputStream writer = new DataOutputStream(fos);

		try {
			// Write the set of data items
			writer.writeInt(5);
			// Write each data set
			writer.writeUTF("Id1");
			writer.writeUTF("Alice");
			writer.writeInt(50000);
		
			writer.writeUTF("Id2");
			writer.writeUTF("Bob");
			writer.writeInt(51000);
		
			writer.writeUTF("Id3");
			writer.writeUTF("Charlie");
			writer.writeInt(52000);
		
			writer.writeUTF("Id4");
			writer.writeUTF("Dave");
			writer.writeInt(53000);
		
			writer.writeUTF("Id5");
			writer.writeUTF("Ed");
			writer.writeInt(54000);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Close the output
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		System.out.printf("Data file %s written\n", outputFileName);
	}	
}
