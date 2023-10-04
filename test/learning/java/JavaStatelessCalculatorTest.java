package learning.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

public class JavaStatelessCalculatorTest {
    @Test public void testConcurrent() throws InterruptedException {
        JavaStatelessCalculator calculator = new JavaStatelessCalculator(0);
        JavaStatelessCalculator result3 = runThreadThatComputes3(calculator);
        JavaStatelessCalculator result5 = runThreadThatComputes5(calculator);
        Assert.assertEquals(3, result3.getValue(), 0.001);
        Assert.assertEquals(5, result5.getValue(), 0.001);
    }

    private static JavaStatelessCalculator runThreadThatComputes3(JavaStatelessCalculator c) throws InterruptedException {
        AtomicReference<JavaStatelessCalculator> result = null;
        Thread thread = new Thread(() -> result.set(calculationsThatReturn3(c)), "ThreadReturning3");
        thread.start();
        thread.wait(2000);
        return result.get();
    }

    private static JavaStatelessCalculator runThreadThatComputes5(JavaStatelessCalculator c) throws InterruptedException {
        AtomicReference<JavaStatelessCalculator> result = null;
        Thread thread = new Thread(() -> result.set(calculationsThatReturn5(c)), "ThreadReturning5");
        thread.start();
        thread.wait(2000);
        return result.get();
    }

    private static JavaStatelessCalculator calculationsThatReturn3(JavaStatelessCalculator c) {
        return c.sum(3)
                .times(2)
                .dividedBy(0.5)
                .minus(3)
                .sqrt();
    }

    //Returns 5.0 in the calculator state
    private static JavaStatelessCalculator calculationsThatReturn5(JavaStatelessCalculator c) {
        return c.sum(5)
                .times(2)
                .dividedBy(0.5)
                .minus(-5)
                .sqrt();
    }
}
