package algorithm;

import exception.NullTriangleException;
import model.Triangle;

public class PathFinder {
    
    private Triangle triangle;
    
    public PathFinder(Triangle input) {
        if(input == null) {
            throw new NullTriangleException();
        }
        
        this.triangle = input;
    }
    
    public final long getBiggestSum() {
        long sum = triangle.getFristPosition();
        
        int col = 0;
        
        for(int i = 0; i < triangle.getTriangleSize() - 1; i++) {
            sum += triangle.getBiggestNeighbor(i, col);
            
            col = triangle.getColBiggestNeighbor(i, col);
        }
        
        return sum;
    }
}
