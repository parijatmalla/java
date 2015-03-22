package cs520.hw1;

import javax.swing.JOptionPane;

/**
 * @author Parijat Malla
 * 
 * 
 * program to get input from user and show the number of bills of denominations 100,50,20,10,5,2,1
 *
 * */


public class Banking {

	public static void main(String[] args) {

		String input;
		int amount;
		int hundreds, fifties, twenties, tens, fives, twos, ones;
		int remainingAmount;

		// Get dollar amount from user
		input = JOptionPane.showInputDialog("Enter the amount:");
		
		// convert to an integer assuming user sends only integer
		amount = Integer.parseInt(input);

		System.out.println("Requested Amount = " + amount);

		// get denominations of 100
		hundreds = amount / 100;

		remainingAmount = amount % 100;
		System.out.println("Hundreds = " + hundreds + " , Remaining Amount = "
				+ remainingAmount);

		// get denominations of 50
		fifties = remainingAmount / 50;

		remainingAmount = remainingAmount % 50;
		System.out.println("Fifties = " + fifties + " , Remaining Amount = "
				+ remainingAmount);

		// get 20 denominations
		twenties = remainingAmount / 20;

		remainingAmount = remainingAmount % 20;
		System.out.println("Twenties = " + twenties + " , Remaining Amount = "
				+ remainingAmount);

		// get denominations of 10
		tens = remainingAmount / 10;

		remainingAmount = remainingAmount % 10;
		System.out.println("Tens = " + tens + " , Remaining Amount = "
				+ remainingAmount);

		// get denominations of 5

		fives = remainingAmount / 5;

		remainingAmount = remainingAmount % 5;
		System.out.println("Fives = " + fives + " , Remaining Amount = "
				+ remainingAmount);

		// get denominations of 2

		twos = remainingAmount / 2;

		remainingAmount = remainingAmount % 2;
		System.out.println("Twos = " + twos + " , Remaining Amount = "
				+ remainingAmount);

		// get denominations of 1

		ones = remainingAmount / 1;

		remainingAmount = remainingAmount % 1;
		System.out.println("Ones = " + ones);

		// show the denominations to user

		JOptionPane.showMessageDialog(null, "Requested Amount (" + amount + ")"
				+ "\nHundreds (" + hundreds + ")" + "\nFifties (" + fifties
				+ ")" + "\nTwenties (" + twenties + ")" + "\nTens (" + tens
				+ ")" + "\nFives (" + fives + ")" + "\nTwos (" + twos + ")"
				+ "\nOnes (" + ones + ")");
	}
}
