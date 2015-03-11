package com.imath;

import com.imath.interfaces.Operator;

public class IMultiply implements Operator{

	public IMultiply() {
		// TODO Auto-generated constructor stub
	}
	private Integer operand1;
	private Integer operand2;
	private Integer result;
		
		public IMultiply(Integer a, Integer b) {
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
			result= operand1*operand2;
			
			
		}

		public Object result() {
			return result;
		}

		public void showResult() {
			// TODO Auto-generated method stub
			System.out.println("The product of "+operand1+" and " +operand2 +" is "+ result);
		}

}
