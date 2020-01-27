
public class EVException extends Exception {

	/*
	 * This constructor only serves to call the parent constructor with a custom
	 * message
	 */
	EVException() {
		super("Illegal EV(s)");
	}

}
