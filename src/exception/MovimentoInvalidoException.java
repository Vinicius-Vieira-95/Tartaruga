package exception;

public class MovimentoInvalidoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public MovimentoInvalidoException(String msg) {
		super(msg);
	}

}
