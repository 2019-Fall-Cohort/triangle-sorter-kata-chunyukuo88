package triangle_sorter;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleSorterTest {
    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType, is("Equilateral"));
    }
    
    @Test
    public void onlyTwoEqualSidesIsAnIsoceles() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(1, 1, 3);
        assertThat(triangleType, is("Isoceles"));
    }
    
    @Test
    public void  isScaleneTriangle() {
    	TriangleSorter underTest = new TriangleSorter();
    	String triangleType = underTest.analyze(1, 2, 3);
    	assertThat(triangleType, is("Scalene"));
    }
    
    @Test 
//    Note that this is testing a different method from the previous three.
    public void isRightTriangle() {
    	TriangleSorter underTest = new TriangleSorter();
    	boolean triangleType = underTest.pythagoreanTester(5,  12, 13);
    	assertThat(triangleType, is(true));
    }
    
    @Test
//    Back to testing the analyze() method:
    public void firstMethodNowIncludesPythagorean() {
    	TriangleSorter underTest = new TriangleSorter();
    	String triangleType = underTest.analyze(5, 12, 13);
    	assertThat(triangleType, is("Right triangle"));
    }
    
    @Test
//  This also uses a separate method.
    public void testIfSidesFormTriangle() {
    	TriangleSorter underTest = new TriangleSorter();
    	boolean triangleType = underTest.triangleChecker(1, 1, 10);
    	assertThat(triangleType, is (false));
    }
    
    @Test
    //The big change here was changing the 
    public void firstMethodNowIncludesTriangleChecker() {
    	TriangleSorter underTest = new TriangleSorter();
    	String triangleType = underTest.analyze(1, 1, 10);
    	assertThat(triangleType, is("That is not a triangle"));
    }
}

