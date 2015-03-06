package com.math;


public class Calculator {

	private int firstno;
	private int secondno;
	private Sum sum;
	private Multiply m;

	private Subtract diff;
	
	public Calculator(int a, int b) {
		// TODO Auto-generated constructor stub
		firstno = a;
		secondno = b;
		sum=new Sum(a,b);
		diff=new Subtract(a,b);
		m=new Multiply(a,b);
	}

	public int getSum() {
		return sum.calculate();
	}
	
	public int getdifference()
	{
		return diff.calculatediff();
	}
	public int getproduct()
	{return m.product();}

	public static void main(String[] args) {
		// TODO Auto-generated method st
		try {
			Calculator c = new Calculator(Integer.parseInt(args[0]),
					Integer.parseInt(args[1]));
			System.out.println("Sum of two numbers " + c.firstno + " and "
					+ c.secondno + " is " + c.getSum());
			
			System.out.println("Difference of two numbers " + c.firstno + " and "
					+ c.secondno + " is " + c.getdifference());
			System.out.println("Product of two numbers " + c.firstno + " and "
					+ c.secondno + " is " + c.getproduct());

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Args has not been set");
			e.printStackTrace();
		}

	}

}
