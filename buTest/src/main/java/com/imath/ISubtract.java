package com.imath;

import com.imath.interfaces.Operator;

public class ISubtract implements Operator {
	Integer operand1;
	Integer operand2;
	Integer result;

	public ISubtract() {
		// TODO Auto-generated constructor stub
	

	}
	public void setoperands(Integer a, Integer b) {
		// TODO Auto-generated constructor stub
		operand1 = a;
		operand2 = b;
	}
	public boolean isInputValid() {
		// TODO Auto-generated method stub

		if (operand1 instanceof Integer && operand2 instanceof Integer)
			return true;
		else
			return false;
	}

	public void compute() {
		// TODO Auto-generated method stub

		result = operand1 - operand2;

	}

	public Object result() {
		return result;
}

	public void showResult() {
		// TODO Auto-generated method stub
		System.out.println("The difference between " + operand1 + " and "
				+ operand2 + " is " + result);

	}
	public void setoperators() {
		// TODO Auto-generated method stub
		
	}

}
