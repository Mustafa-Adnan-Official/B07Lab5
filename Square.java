package B07Lab5;


public class Square {
	
	/**
	 * Initialize four points for the square class
	 */
	Point A; 
	Point B;
	Point C;
	Point D;

	/**
	 * Sets up square object with four ponts
	 * @param A
	 * @param B
	 * @param C
	 * @param D
	 */
	public Square(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		
	}
	
	/**
	 * Returns the perimeter of the square
	 * @return the total distance around the square
	 */
	public double perimeter() {
		double sideLength = A.distance(B);
		return sideLength * 4.0;
	}
	
	/**
	 * Returns if the four points correlate to a square
	 * @param A
	 * @param B
	 * @param C
	 * @param D
	 * @return if square or not
	 */
	public static boolean isSquare(Point A, Point B, Point C, Point D) {
		
		final double EPSILON = 1e-9;
		
		//For side lengths
		double side1 = A.distance(B);
		double side2 = B.distance(C);
		double side3 = C.distance(D);
		double side4 = D.distance(A);
		
		if (side1 < EPSILON || side2 < EPSILON || side3 < EPSILON || side4 < EPSILON) {
			return false;
		}
		

		
		
		//For diagonal length
		double diagLength1 = A.distance(C);
		double diagLength2 = D.distance(B);
		
		//If all side lengths are equal than: square or rhombus
		boolean sideLengthEqual = Math.abs(side1 - side2)<EPSILON && Math.abs(side1 - side3)<EPSILON && Math.abs(side1 - side4)<EPSILON;
	
		//If all diagonals are equal than definently square
		boolean diagLengthEqual = Math.abs(diagLength1 - diagLength2)<EPSILON;
		
		//Safety check: pythagoreus theorem should hold
		boolean pythagorasHolds = Math.abs(diagLength1*diagLength1 - (2.0*side1*side1)) < EPSILON;
		
		
		//return if square
		return sideLengthEqual && diagLengthEqual && pythagorasHolds; 
	
	}
	

}
