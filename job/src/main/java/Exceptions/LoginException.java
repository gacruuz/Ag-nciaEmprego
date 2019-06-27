package Exceptions;

public class LoginException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginException() {
		super("Deu pau no login");
		System.out.println("Criei a exceção");
	}
}