package cs520.module3.L3_fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class P06_ReadingObjects {
	
	public static void main(String[] args)
	{
		String inputFileName = "salaryObjects.data";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(inputFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream is = new ObjectInputStream(fis);
			// Read the number of objects
			int numberOfEmployees = is.readInt();
			System.out.printf("Number of Accounts Read = %d\n",
					numberOfEmployees);
			
			for (int i = 1; i <= numberOfEmployees; i++)
			{
				Object data = is.readObject();
				// Cast the object to an Employee type
				Employee account = (Employee)data;
				System.out.println(account.displayInfo());
			}
			is.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		} 
	}
}
