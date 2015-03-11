package com.imath.interfaces;

public interface Operator  {
	public boolean isInputValid();

	public void compute();

	public Object result();
	
	public void showResult ();
}
