package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Triangle;
import main.TriangleError;

public class TriangleTest {
	@Test
    public final void constructorTest() {
        int[][] triangle = {{6},{3,5},{9,7,1},{4,6,8,4}};
        
        new Triangle(triangle);
    }
    
    @Test(expected = TriangleError.class)
    public final void incorrectConstructorTest() {
        int[][] triangle = null;
        
        new Triangle(triangle);
    }
    
    @Test
    public final void getValueTest() {
        int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
        
        Triangle triangle = new Triangle(triangleConfig);
        
        assertEquals(6, triangle.getValue(0, 0));
    }
    
    @Test
    public final void getValueTest2() {
        int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
        
        Triangle triangle = new Triangle(triangleConfig);
        
        assertEquals(3, triangle.getValue(1, 0));
    }
    
    @Test
    public final void getTriangleSize() {
        int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
        
        Triangle triangle = new Triangle(triangleConfig);
        
        assertEquals(4, triangle.getTriangleSize());
    }
}
