package cs520.module3.L2_exceptions;

@SuppressWarnings("serial")
public class DivisionByZeroException extends Exception {
	
	public DivisionByZeroException() {
		super("Division By Zero...");
	}
	
	public DivisionByZeroException(String msg) {
		super(msg);
	}
}
