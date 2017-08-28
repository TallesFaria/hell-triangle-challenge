package test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import main.Triangle;
import main.TriangleError;
import main.TriangleSearch;

public class Algorithm {
	static int[][] stressTriangleConfig;
	
    @BeforeClass
    public static final void initialConfigurations() {
        stressTriangleConfig = new int[10000][];
        
        for(int i = 0; i < stressTriangleConfig.length; i++) {
            stressTriangleConfig[i] = new int[i + 1];
            
            for(int j = 0; j < (i + 1); j++) {
                stressTriangleConfig[i][j] = (int) (Math.random() * 1000);
            }
        }
    }
    
    @Test
    public final void constructorTest() {
        int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
        
        Triangle triangle = new Triangle(triangleConfig);
        
        new TriangleSearch(triangle);
    }
    
    @Test(expected = TriangleError.class)
    public final void incorrectConstructorTest() {
        Triangle triangle = null;
        
        new TriangleSearch(triangle);
    }
    
    @Test
    public final void getBiggestSumTest() {
        int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
        
        Triangle triangle = new Triangle(triangleConfig);
        
        TriangleSearch TriangleSearch = new TriangleSearch(triangle);
        
        assertEquals(26, TriangleSearch.getBiggestSum());
    }
    
    @Test
    public final void getBiggestSumTest2() {
        int[][] triangleConfig = {{6},{8,4},{2,3,1},{7,12,15,-3},{-8, -7, 0, 4, 5},{6, -2, 1, -2, 7, -4}};
        
        Triangle triangle = new Triangle(triangleConfig);
        
        TriangleSearch TriangleSearch = new TriangleSearch(triangle);
        
        assertEquals(43, TriangleSearch.getBiggestSum());
    }
    
    @Test
    public final void getBiggestSumStressTest() {
        Triangle triangle = new Triangle(stressTriangleConfig);
        
        TriangleSearch TriangleSearch = new TriangleSearch(triangle);
        
        TriangleSearch.getBiggestSum();
    }
}
