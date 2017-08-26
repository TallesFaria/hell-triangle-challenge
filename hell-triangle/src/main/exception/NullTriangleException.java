package exception;

public class NullTriangleException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NullTriangleException() {
	    super("The triangle can't be null!");
    }
}
