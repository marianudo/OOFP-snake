package learning.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// Implement a test class that validates the correctness of the Calculator class logic
// This exercise is intended to practice writing code to use objects of classes we have
// previously implemented ourselves.
public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test void testSum() {
        // Create a Calculator object and test that the sum method works as expected
        calculator.sum(5);
        assertEquals(5, calculator.getValue());
    }

    @Test void testMinus() {
        calculator.minus(3);
        assertEquals(-3, calculator.getValue());
    }

    @Test void testTimes() {
        calculator.sum(2);
        calculator.times(3);
        assertEquals(6, calculator.getValue());
    }

    @Test void testDividedBy() {
        calculator.sum(4);
        calculator.dividedBy(2);
        assertEquals(2, calculator.getValue());
    }

    @Test void testSquareRoot() {
        calculator.sum(9);
        calculator.sqrt();
        assertEquals(3, calculator.getValue());
    }

    @Test void testReset() {
        calculator.sum(19);
        calculator.reset();
        assertEquals(0, calculator.getValue());
    }

    @Test void testCombinedOperations() {
        calculator.sum(12);
        calculator.minus(3);
        calculator.sqrt();;
        calculator.times(2);
        calculator.dividedBy(3);
        assertEquals(2, calculator.getValue());
    }
}
