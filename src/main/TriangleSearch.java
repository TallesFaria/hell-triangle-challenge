package main; 

public class TriangleSearch {
	
	private Triangle triangle;
	    
   	public TriangleSearch(Triangle data) {
        if(data == null) {
            throw new TriangleError();
        }
        
        this.triangle = data;
    }    
    
    public final int getBiggestSum() {
        int size = triangle.getTriangleSize();
        int[][] triangleHell = new int[size][size];

        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangleHell[i][j] += Math.max(triangle.getValue(i+1,j), triangle.getValue(i+1, j+1));
            }
        }
        
        return triangleHell[0][0];
    }
}
