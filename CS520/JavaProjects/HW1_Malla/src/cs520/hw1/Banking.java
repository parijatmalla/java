package cs520.hw1;

/* Display denominations of money in ATM*/

import javax.swing.JOptionPane;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input, output;
		int amount;

		int hundreds, fifties, twenties, tens, fives, twos, ones;

		int remainingamount;

		// Get dollar amount from user//
		input = JOptionPane.showInputDialog("Enter the amount:");
		// convert to an integer
		amount = Integer.parseInt(input);

		System.out.println("Requested Amount = " + amount);

		// get 100 denominations//

		hundreds = amount / 100;

		// get remaining amount//
		remainingamount = amount % 100;
		System.out.println("Hundreds = " + hundreds + " , Remaining Amount = "
				+ remainingamount);

		// get 50 denominations//

		fifties = remainingamount / 50;

		// get remaining amount//
		remainingamount = remainingamount % 50;
		System.out.println("Fifties = " + fifties + " , Remaining Amount = "
				+ remainingamount);

		// get 20 denominations//

		twenties = remainingamount / 20;

		// get remaining amount//
		remainingamount = remainingamount % 20;
		System.out.println("Twenties = " + twenties + " , Remaining Amount = "
				+ remainingamount);

		// get 10 denominations//

		tens = remainingamount / 10;

		// get remaining amount//
		remainingamount = remainingamount % 10;
		System.out.println("Tens = " + tens + " , Remaining Amount = "
				+ remainingamount);

		// get 5 denominations//

		fives = remainingamount / 5;

		// get remaining amount//
		remainingamount = remainingamount % 5;
		System.out.println("Fives = " + fives + " , Remaining Amount = "
				+ remainingamount);

		// get 2 denominations//

		twos = remainingamount / 2;

		// get remaining amount//
		remainingamount = remainingamount % 2;
		System.out.println("Twos = " + twos + " , Remaining Amount = "
				+ remainingamount);

		// get 1 denominations//

		ones = remainingamount / 1;

		// get remaining amount//
		remainingamount = remainingamount % 1;
		System.out.println("Ones = " + ones);

		// show the denominations to user//

		JOptionPane.showMessageDialog(null, "Requested Amount (" + amount
				+ ")" + "\r\nHundreds (" + hundreds + ")" +"\r\nFifties (" + fifties + ")" + "\r\nTwenties ("
				+ twenties + ")" + "\r\nTens (" + tens + ")" + "\r\nFives ("
				+ fives + ")" + "\r\nTwos (" + twos + ")" + "\r\nOnes ("
				+ ones + ")");
	}
}
