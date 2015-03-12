package com.imath;

import com.math.Sum;

public class iCalculator {

	/*
	 * private Integer firstno; private Integer secondno; private String
	 * operator;
	 */
	// private iSum sum;

	public iCalculator(Integer a, String args, Integer b) {
		// TODO Auto-generated constructor stub

	}

	/*
	 * sum=new Sum(a,b); diff=new Subtract(a,b); m=new Multiply(a,b);
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method st
		try {
			/*
			 * iCalculator c = new iCalculator(Integer.parseInt(args[0]),
			 * args[1], Integer.parseInt(args[2]));
			 */

			/*
			 * System.out.println("Sum of two numbers " + c.firstno + " and " +
			 * c.secondno + " is " + c.getSum());
			 * 
			 * System.out.println("Difference of two numbers " + c.firstno +
			 * " and " + c.secondno + " is " + c.getdifference());
			 * System.out.println("Product of two numbers " + c.firstno +
			 * " and " + c.secondno + " is " + c.getproduct());
			 */

			if (args[1].equals("+")) {
				SumString s1 = new SumString();
				s1.setoperands(args[0], args[2]);
				System.out.println("Sum of string:" + s1.addStrings());
				s1=null;
				/*
				 * Sum integers ISum s = new ISum(); s.setoperands(a,b);
				 * 
				 * if (s.isInputValid()) { s.compute(); s.showResult(); s=null;
				 * }
				 */

			}
			if (args[1].equals("-")) {
				ISubtract sub = new ISubtract();
				sub.setoperands(Integer.parseInt(args[0]),
						Integer.parseInt(args[2]));
				if (sub.isInputValid()) {
					sub.compute();
					sub.showResult();
					sub = null;
				}
			}
			if (args[2].equals("*")) {
				IMultiply s = new IMultiply();
				s.setoperands(Integer.parseInt(args[0]),
						Integer.parseInt(args[2]));
				if (s.isInputValid()) {
					s.compute();
					s.showResult();
					s = null;
				}

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Args has not been set");
			e.printStackTrace();
		}

	}
}
