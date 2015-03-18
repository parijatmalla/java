package cs520.module1.L1_intro;

/**
 * Application prints welcome message, adds two numbers and outputs results
 * 
 */


public class P01_Welcome 
{
	public static void main(String[] args) 
	{
		// display a greeting in the console window
		
		System.out.println("Welcome to Java!");
		System.out.println("Computers are great at arithmetic");
		int a = 11, b = 22;
		int sum;
		sum = a + b;
		System.out.println("The sum of " + a + " + " + b + " is " + sum);
	}
}
