
public class IVException extends Exception {

	private static final long serialVersionUID = 1L;

	/*
	 * This constructor only serves to call the parent constructor with a custom
	 * message
	 */
	IVException() {
		super("Illegal IV values");
	}
}
