package learning.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// Implement a test class that validates the correctness of the Calculator class logic
// This exercise is intended to practice writing code to use objects of classes we have
// previously implemented ourselves.
public class JavaCalculatorTest {
    private final Calculator calculator = new Calculator();

    private void initCalculatorWithValue(double value) {
        // TODO Replace this implementation with a call to the new constructor that takes a value as initial state
        calculator.reset();
        calculator.sum(value);
    }

    @Test void testSum() {
        // Create a Calculator object and test that the sum method works as expected
        initCalculatorWithValue(5);
        calculator.sum(3);
        assertEquals(8, calculator.getValue());
    }

    @Test void testMinus() {
        initCalculatorWithValue(0);
        calculator.minus(3);
        assertEquals(-3, calculator.getValue());
    }

    @Test void testTimes() {
        initCalculatorWithValue(2);
        calculator.times(3);
        assertEquals(6, calculator.getValue());
    }

    @Test void testDividedBy() {
        initCalculatorWithValue(4);
        calculator.dividedBy(2);
        assertEquals(2, calculator.getValue());
    }

    @Test void testSquareRoot() {
        initCalculatorWithValue(9);
        calculator.sqrt();
        assertEquals(3, calculator.getValue());
    }

    @Test void testReset() {
        initCalculatorWithValue(19);
        calculator.reset();
        assertEquals(0, calculator.getValue());
    }

    @Test void testCombinedOperations() {
        initCalculatorWithValue(10);
        calculator.sum(2);
        calculator.minus(3);
        calculator.sqrt();
        calculator.times(2);
        calculator.dividedBy(3);
        assertEquals(2, calculator.getValue());
    }
}
