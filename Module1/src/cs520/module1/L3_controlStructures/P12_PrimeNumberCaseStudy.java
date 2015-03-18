package cs520.module1.L3_controlStructures;

/*
 * The program finds the n th prime number 
 * by checking all odd numbers
 */

import javax.swing.*;

public class P12_PrimeNumberCaseStudy 
{	
	
	// Checks if a given number is prime
	
	public static boolean isPrime(long n) 
	{
		// rule out even numbers
		if (n % 2 == 0) 
		{
			return false;
		}
		
		// upper limit for divisibility
		long limit = (long) Math.sqrt(n);
		
		// check if the given number is divisible by
		// any odd number up to the limit
		
		for (long i = 3; i <= limit; i = i + 2) 
		{
			if (n % i == 0) // not a prime
			{
				return false;	
			}	
		}	
		// is a prime
		return true;
	}
	
		// Compute the nth prime
		public static long getNthPrime(long n) 
		{
			// the first prime number is 2
			if (n == 1)
				return 2;
			
			long number = 1;
			long count = 1;
			
			// Loop until the n th prime is found
			do {
				number = number + 2;
				if (isPrime(number)) 
				{
					count++;
				}
			} while (count < n);
			
			return number;
		}
			
		public static void main(String[] args) 
		{
			// Ask the user for input
			String input = JOptionPane.showInputDialog("" +
		 			"Enter an integer (>= 1):"); 
			// convert to an integer
			int n = Integer.parseInt(input);			
		 	
			// call the method
			long result = getNthPrime(n);				
			
			// Display the result
			JOptionPane.showMessageDialog(null, 
					"The prime number is " + result);
    	}
	}
