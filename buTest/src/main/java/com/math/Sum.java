package com.math;

public class Sum {
	private int firstno;
	private int secondno;

	public Sum(int a, int b) {
		// TODO Auto-generated constructor stub

		firstno = a;
		secondno = b;
	}

	public  int calculate() {
		return firstno + secondno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum s1 = new Sum(2, 90);
		System.out.println("Sum of two numbers " + s1.firstno + " and "
				+ s1.secondno + " is " + s1.calculate());

	}

}
