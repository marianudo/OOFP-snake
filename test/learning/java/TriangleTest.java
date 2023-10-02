package learning.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void testPerimeter() {
        Triangle t = new Triangle(3);
        int trianglePerimeter = t.perimeter();
        assertEquals(9, trianglePerimeter);
    }
}
