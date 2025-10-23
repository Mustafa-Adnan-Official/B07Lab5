package B07Lab5; // i.e. the code that follows belongs to package B07Lab5

import static org.junit.jupiter.api.Assertions.*;
/* Statically imports methods of the Assertions class in JUnit 5
 * so that its methods can be called directly (without writing Assertions.)
 */

import org.junit.jupiter.api.Test;
/* Imports the @Test annotation from JUnit 5
 */

public class SquareTest { // [visible to all packages]
/* A class named SquareTest
 * meant to store concrete test methods for the Square class
 * note that test methods do not take arguments, so they are not included
 */
	
  // The following test method(s) are meant to verify the correctness of the perimeter() method
	@Test
	void perimeterBasic() {
	/* A concrete test method named perimeterBasic
	 * tests the case where a square object has side-lengths of 3.0 each (expected perimeter should be 12.0)
	 */
		Square s = new Square(						// i.e. create a new Square object called s
				new Point (0.0,0.0),				// make one of the vertices (0.0,0.0), which has distance 3.0 from (0.0,3.0)
				new Point (3.0,0.0),				// make one of the vertices (3.0,0.0), which has distance 3.0 from (0.0,0.0)
				new Point (3.0,3.0),				// make one of the vertices (3.0,3.0), which has distance 3.0 from (3.0,0.0)
				new Point (0.0,3.0)					// make one of the vertices (0.0,3.0), which has distance 3.0 from (3.0,3.0)
			);
		assertEquals(12.0, s.perimeter(), 1e-6); 	// return true if the perimeter of s (i.e. 3.0 * 4.0) is equivalent to 12.0
	}
	
  // The following test method(s) are meant to verify the correctness of the isSquare() method
	@Test
	void isSquareBasicTrue() {
	/* A concrete test method named isSquareBasicTrue
	 * tests using the points (0,0), (4,0), (4,4), and (0,4)
	 * we know that a square with side-lengths of 4 can be formed using these points
	 */
		assertTrue(Square.isSquare(
			new Point (0.0,0.0),
			new Point (4.0,0.0),
			new Point (4.0,4.0),
			new Point (0.0,4.0)));
	}
	@Test
	void isSquarePrecisionTrue() {
	/* A concrete test method named isSquarePrecisionTrue
	 * tests using the points (0,0), (Math.sqrt(2), 0), (Math.sqrt(2), Math.sqrt(2)), and (0, Math.sqrt(2))
	 * we know that a square with side-lengths of sqrt(2) can be formed using these points
	 */
		assertTrue(Square.isSquare(
			new Point (0.0,0.0),
			new Point (Math.sqrt(2),0.0),
			new Point (Math.sqrt(2),Math.sqrt(2)),
			new Point (0.0,Math.sqrt(2))));
	}
	@Test
	void isSquareRotatedTrue() {
	/* A concrete test method named isSquareRotatedTrue
	 * tests using the points (0,1), (1,2), (2,1), and (1,0)
	 * we know that a square with side-lengths of 1 can be formed using these points
	 */
		assertTrue(Square.isSquare(
			new Point (0.0,1.0),
			new Point (1.0,2.0),
			new Point (2.0,1.0),
			new Point (1.0,0.0)));
	}
	@Test
	void isSquareSamePointsFalse() {
	/* A concrete test method named isSquareSamePointsFalse
	 * tests using the points (0,0), (0,0), (0,0), and (0,0)
	 * we know that a square cannot have side-lengths of 0
	 */
		assertFalse(Square.isSquare(
			new Point (0.0,0.0),
			new Point (0.0,0.0),
			new Point (0.0,0.0),
			new Point (0.0,0.0)));
	}
	@Test
	void isSquareRectangleFalse() {
	/* A concrete test method named isSquareRectangleFalse
	 * tests using the points (0,0), (3,0), (3,2), and (0,2)
	 * we know that a rectangle with side-lengths of 2 and 3 can be formed using these points
	 */
		assertFalse(Square.isSquare(
			new Point (0.0,0.0),
			new Point (3.0,0.0),
			new Point (3.0,2.0),
			new Point (0.0,2.0)));
	}
	@Test
	void isSquareRhombusFalse() {
	/* A concrete test method named isSquareRhombusFalse
	 * tests using the points (0,1), (2,2), (4,1), and (2,0)
	 * we know that a rhombus with side-lengths of sqrt(5) can be formed using these points
	 */
		assertFalse(Square.isSquare(
			new Point (0.0,1.0),
			new Point (2.0,2.0),
			new Point (4.0,1.0),
			new Point (2.0,0.0)));
	}
}
