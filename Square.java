package B07Lab5;

import java.awt.Point;

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
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
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
		//For side lengths
		double side1 = A.distance(B);
		double side2 = B.distance(C);
		double side3 = C.distance(D);
		double side4 = D.distance(A);
		
		//For diagonal length
		double diagLength1 = A.distance(C);
		double diagLength2 = D.distance(B);
		
		//If all side lengths are equal than: square or rhombus
		boolean sideLengthEqual = (side1 == side2) && (side1 == side3) && (side1 == side4) && (side2 == side3) && (side2 == side4) && (side3 == side4);
	
		//If all diagonals are equal than definently square
		boolean diagLengthEqual = (diagLength1 == diagLength2);
		
		//return if square
		return sideLengthEqual && diagLengthEqual;
	
	}
	

}
