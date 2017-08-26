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
    
    public final int getFristPosition() {
	    return triangle[0][0];
    }
    
    protected final int getLeftNeighbor(final int i, final int j) {
	    return triangle[i + 1][j];
    }
    
    protected final int getRightNeighbor(final int i, final int j) {
	    return triangle[i + 1][j + 1];
    }
    
    public final int getBiggestNeighbor(final int i, final int j) {
	    return Math.max(getLeftNeighbor(i, j), getRightNeighbor(i, j));
    }
    
    public final int getTriangleSize() {
	    return this.triangle.length;
    }

    public final int getColBiggestNeighbor(final int i, final int j) {
        if(getLeftNeighbor(i, j) > getRightNeighbor(i, j)) {
            return j;
        } else {
            return j+1;
        }
    }
}
