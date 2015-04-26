package kr.simula.formula.core;

public class InternalException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InternalException(String message, Throwable cause) {
		super(message, cause);
	}

	public InternalException(String message) {
		super(message);
	}

	public InternalException(Throwable cause) {
		super(cause);
	}

}
