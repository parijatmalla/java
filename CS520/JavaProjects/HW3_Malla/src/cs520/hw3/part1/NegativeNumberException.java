package cs520.hw3.part1;

public class NegativeNumberException extends Exception {

	/**
	 * 
	 * class for handling negative number exceptions
	 */
	private static final long serialVersionUID = -3141418575726463959L;

	public NegativeNumberException() {
		super("Input number is a Negative Number ");
	}

	public NegativeNumberException(String message){
		super(message);
	}
}
