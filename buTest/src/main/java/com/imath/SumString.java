package com.imath;

public class SumString extends ISum {
	String operand1;
	String operand2;

	public SumString() {
		super();
		// TODO Auto-generated constructor stub

	}

	public void setoperands(String a, String b) {
		operand1 = a;
		operand2 = b;
	}

	public String addStrings() {
		return operand1 + operand2;

	}
}
