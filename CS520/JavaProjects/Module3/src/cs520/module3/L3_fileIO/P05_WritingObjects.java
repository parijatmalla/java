package cs520.module3.L3_fileIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

public class P05_WritingObjects {
	
	public static void main(String[] args)
	{
		String outputFileName = "salaryObjects.data";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outputFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Create the ObjectOutputStream
		try {
			ObjectOutputStream os = new ObjectOutputStream(fos);
			// Write the number of objects	
			int numberOfEmployees = 5;
			os.writeInt(numberOfEmployees);
			
			// Create and write each object
			Employee newEmployee;
			newEmployee = new Employee("Id1", "Alice", 50000);
			os.writeObject(newEmployee);
			
			newEmployee = new Employee("Id2", "Bob", 51000);
			os.writeObject(newEmployee);
			
			newEmployee = new Employee("Id3", "Charlie", 52000);
			os.writeObject(newEmployee);
			
			newEmployee = new Employee("Id4", "Dave", 53000);
			os.writeObject(newEmployee);
			
			newEmployee = new Employee("Id5", "Ed", 54000);
			os.writeObject(newEmployee);
		
			os.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.printf("Data file %s written\n", outputFileName);
	}
}
