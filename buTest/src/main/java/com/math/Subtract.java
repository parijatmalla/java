package com.math;

public class Subtract {

	private int firstno;
	private int secondno;

	public Subtract(int a, int b) {
		// TODO Auto-generated constructor stub
		 firstno=a;
		secondno=b;
	}

	public int calculatediff() {
		if (firstno >= secondno) {
			return firstno - secondno;
		} else {
			return secondno - firstno;
		}
	}
}
