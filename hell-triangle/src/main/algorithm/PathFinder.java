package algorithm;

import exception.NullTriangleException;
import model.Triangle;

public class PathFinder {
    
    private Triangle triangle;
    
    public PathFinder(Triangle data) {
        if(data == null) {
            throw new NullTriangleException();
        }
        
        this.triangle = data;
    }    
    
    public final int getBiggestSum() {
        int size = triangle.getSize();
        int[][] triangleHell = new int[size][size]

        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangleHell[i, j] += Math.Max(triangle.getValue(i+1,j), triangle.getValue(i+1, j+1));
            }
        }
        
        return triangleHell[0][0];
    }
}
