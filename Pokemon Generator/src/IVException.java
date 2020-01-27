
public class IVException extends Exception {

	/*
	 * This constructor only serves to call the parent constructor with a custom
	 * message
	 */
	IVException() {
		super("Illegal IV values");
	}
}
