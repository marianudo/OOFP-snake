package learning.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void testPerimeter() {
        Square square = new Square(2);
        int perimeter = square.perimeter();
        Assertions.assertEquals(8, perimeter);
    }
}
