package cs520.module4.L2_arrays;

public class P06_TwoDimensionalArrays {

	public static void main(String[] args) {
	
		// Declare an array of integer values
		int size = 10;
		int[][] timesTable = new int[size][size];
		
		for (int row = 0; row < size; row++)
		{
			for (int col = 0; col < size; col++)
			{
				timesTable[row][col] = (row+1)*(col+1);
			}
		}
		//Display the table
		System.out.println("Using nested For loops");
		for (int row = 0; row < size; row++)
		{
			for (int col = 0; col < size; col++)
			{
				System.out.printf("%3d ", timesTable[row][col]);
			}
			System.out.println();
		}
		// Using the for-each 
		System.out.println("Using nested for-each constructs");
		for (int[] row : timesTable)
		{
			for (int data : row)
			{
				System.out.printf("%3d ", data);		
			}
			System.out.println();
		}
	}
}
