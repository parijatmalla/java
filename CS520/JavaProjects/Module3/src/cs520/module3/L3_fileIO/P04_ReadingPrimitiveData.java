package cs520.module3.L3_fileIO;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P04_ReadingPrimitiveData {
	
	public static void main(String[] args)
	{
		String inputFileName = "salaries.data";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(inputFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		// Create the DataInputStream
		DataInputStream reader = new DataInputStream(fis);

		try {
			int numberOfEmployees = reader.readInt();
			System.out.printf("Number of Data Sets = %d\n",
					numberOfEmployees);
			
			for (int i = 1; i <= numberOfEmployees; i++)
			{
				String id = reader.readUTF();
				String name = reader.readUTF();
				int salary = reader.readInt();
				//Create the Employee
				Employee currentEmployee = 
					new Employee(id, name, salary);
				System.out.println(currentEmployee.displayInfo());
			}
			reader.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		} 
	}
}
