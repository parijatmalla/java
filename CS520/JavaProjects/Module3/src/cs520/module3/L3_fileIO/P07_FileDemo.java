package cs520.module3.L3_fileIO;

import java.io.*;

import javax.swing.JFileChooser;

public class P07_FileDemo {
	
	private static long totalSize;
	
	private static void listProperties(File f, String indent)
	{
		if (f.isDirectory() == true)
		{
			System.out.printf("%sDIR %s\n", 
					indent, f.getPath());
			
			for (File f1 : f.listFiles())
			{
				listProperties(f1, indent + " ");
			}
		} 
		else  // it is a file
		{
			System.out.printf("%sFILE %s, Size = %d bytes\n", 
					indent, f.getPath(), f.length());
			totalSize = totalSize + f.length();
		}
	}

	public static void main(String[] args)
	{
		String path = "./";
		// Create a File object
		File f = new File(path);
		// Initialize the size of the contents
		totalSize = 0;
		// Recursively list the properties
		listProperties(f, "");
		
		System.out.printf("Total Size = %d bytes\n", 
				totalSize);
		
	}
}
