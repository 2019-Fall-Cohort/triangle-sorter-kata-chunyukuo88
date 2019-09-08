package triangle_sorter;

public class TriangleSorter {
    
	//This is the "First Method"
	public String analyze(double sideA, double sideB, double sideC) {
		if (triangleChecker(sideA, sideB, sideC) == true)
			return "That is not a triangle.";
		else if (sideA == sideB && sideB == sideC) 
	        return "Equilateral";	
		else if (sideA == sideB || sideA == sideC || sideB == sideC)
			return "Isoceles";
		else if (pythagoreanTester(sideA, sideB, sideC) == true)
			return "Right triangle";
		else if (sideA != sideB && sideB != sideC)
			return "Scalene";
		else
			return "";
    }
	
	public boolean pythagoreanTester(double a, double b, double c) 	{
		double sumOfTwoSquares = (Math.pow(a, 2) + Math.pow(b, 2));
		
		if (Math.pow(sumOfTwoSquares, 0.5) == c)
			return true; //this triangle is a right triangle.
		else
			return false; //this triangle is NOT a right triangle.
	}
	
	public boolean triangleChecker (double a, double b, double c)	{
		if (a + b > c)
			return true; //i.e. the values DO form a triangle.
		else
			return false;//no triangle!
	}
}
