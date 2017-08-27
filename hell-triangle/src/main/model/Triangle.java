package model;

import exception.NullTriangleException;

public class Triangle {
    private int[][] triangle;

    public Triangle(final int[][] input) {
        if(input == null) {
            throw new NullTriangleException();
	    }
	
    	this.triangle = input;
    }
    
    protected final int getValue(final int i, final int j) {
	    return triangle[i][j];
    }
    
    public final int getTriangleSize() {
	    return this.triangle.length;
    }

}
