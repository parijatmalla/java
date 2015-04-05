package cs520.module3.L2_exceptions;



public class P05_Exceptions 
{
	private static int myDivision(int first, int second) 
		throws DivisionByZeroException
	{
		if (second == 0)
			throw new DivisionByZeroException();
		return first/second;
	}
	
	public static void main(String[] args)
	{
		int value1 = 10;
		int value2 = 0;
		try {
			int result = myDivision(value1, value2);
			System.out.printf("The result of %s/%s is %d\n",
					value1, value2, result);
		} catch (DivisionByZeroException e) {
			e.printStackTrace();
		}
	}
}
