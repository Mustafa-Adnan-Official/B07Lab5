package B07Lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class PentagonTest {

    @Test
    public void testPerimeter_irregularPentagon() {
        Point A = new Point(0, 0);
        Point B = new Point(3, 0);
        Point C = new Point(4, 2);
        Point D = new Point(2, 4);
        Point E = new Point(-1, 3);

        Pentagon p = new Pentagon(A, B, C, D, E);

        double expected =
            A.distance(B) +
            B.distance(C) +
            C.distance(D) +
            D.distance(E) +
            E.distance(A);

        assertEquals(expected, p.perimeter(), 0);
    }

    @Test
    public void testIsRegular_falseForIrregular() {
        Point A = new Point(0, 0);
        Point B = new Point(3, 0);
        Point C = new Point(4, 2);
        Point D = new Point(2, 4);
        Point E = new Point(-1, 3);

        Pentagon p = new Pentagon(A, B, C, D, E);
        assertFalse(p.isRegular());
    }
}
