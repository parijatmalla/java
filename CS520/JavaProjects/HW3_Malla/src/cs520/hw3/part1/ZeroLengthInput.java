package cs520.hw3.part1;

public class ZeroLengthInput extends Exception{

	/**
	 * class for handling zero length data fed in input
	 */
	private static final long serialVersionUID = -4518701154239249812L;
	public ZeroLengthInput(){
		super("Input data has zero length");
	}
public ZeroLengthInput(String message){
	super(message);
}
}
