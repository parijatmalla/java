package com.imath;

import com.imath.interfaces.Operator;
import com.imath.interfaces.intOperator;

public class ISum implements Operator{
private Integer operand1;
private Integer operand2;
private Integer result;
	
	public ISum(Integer a, Integer b) {
		// TODO Auto-generated constructor stub
		operand1=a;
		operand2=b;
	}

	public boolean isInputValid() {
		// TODO Auto-generated method stub
		
		if( operand1 instanceof Integer && operand2 instanceof Integer) return true;
		else return false;
	}

	public void compute() {
		// TODO Auto-generated method stub
		result= operand1+operand2;
		
		
	}

	public Object result() {
		// TODO Auto-generated method stub
		compute();
		return result;
	}

	public void showResult() {
		// TODO Auto-generated method stub
		System.out.println("The sum of " + operand1 + " and "
				+ operand2 + " is " + result);
	}

		
		
		
		
		
	

}
