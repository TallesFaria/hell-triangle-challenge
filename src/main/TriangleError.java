package main;

public class TriangleError extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TriangleError() {
	    super("The triangle can't be null!");
    }
}
