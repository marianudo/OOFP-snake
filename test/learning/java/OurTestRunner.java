package learning.java;

import static org.junit.Assert.assertEquals;

public class OurTestRunner {
    public static void main(String[] args) throws InterruptedException {
        // TODO Note for the instructor:
        // Show here what happens when we deal with mutable state in concurrent environments
        // Use for that the CalculatorTest
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        runThreadThatComputes3(calc1);
        runThreadThatComputes5(calc2);
        // Wait for the threads to complete calculations
        Thread.sleep(1000L);
        assertEquals(3, calc1.getValue(), 0.001);
        assertEquals(5, calc2.getValue(), 0.001);
    }

    private static void runThreadThatComputes3(Calculator c) {
        new Thread(() -> calculationsThatReturn3(c), "ThreadReturning3").start();
    }

    private static void runThreadThatComputes5(Calculator c) {
        new Thread(() -> calculationsThatReturn5(c), "ThreadReturning5").start();
    }

    // Will return 3.0 in the Calculator state
    private static void calculationsThatReturn3(Calculator c) {
        c.sum(3);
        c.times(2);
        c.dividedBy(0.5);
        c.minus(3);
        c.sqrt();
    }

    //Returns 5.0 in the calculator state
    private static void calculationsThatReturn5(Calculator c) {
        c.sum(5);
        c.times(2);
        c.dividedBy(0.5);
        c.minus(-5);
        c.sqrt();
    }
}
