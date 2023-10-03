package learning.java;

import java.util.Objects;

/*
 ****************************
 *  Implement a Calculator class.
 *  The class Calculator will abstract over the accumulated result of basic arithmetic calculations
 *  For that the class will hold as its state such accumulated result.
 *  Every Calculator object will be created with an initial state = 0.
 *  It will provide methods to:
 *  - Addition (sum). This method will receive as a parameter a decimal value,
 *   and change the state of the object accordingly. It must return void (no return).
 *  - Subtraction. Same as addition
 *  - Multiplication. Same
 *  - Division. Same
 *  - Square root. Same
 *  It will also provide a method to query the accumulated result of all calculations performed
 *  It will provide another method to reset to state of the object to zero (0)
 ******************************
 */
// New assignment for the weekend (or if too daunting, to review in class next week)
// Implement
public class JavaStatefulCalculator {
    // Declare here a private attribute of type double to accumulate the result.
    // Remember that its initial state should be zero,
    // and the caller shouldn't be able to establish that initial state.
    // As we want to be able to modify this state with each method call,
    // we cannot (and shouldn't) make it final.
    private double value = 0;

    // TODO Assignment - Enable creating a Calculator object with a give state
    // For that, create a public constructor that takes a double as a parameter
    // and assigns it to the Calculator instance value
    // In order to keep the rest of the code compiling, a default constructor
    // (with no parameters) will be needed.

    // Create a method to add an arbitrary decimal number to the state of the Calculator
    // Name it sum, declare a return type of 'void', and make it public
    public void sum(double v) {
        value += v;
    }

    // Now do the same for:
    // Subtraction (method name 'minus')
    public void minus(double v) {
        value -= v;
    }

    // Multiplication (method name 'times')
    public void times(double v) {
        value *= v;
    }

    // Division (method name 'dividedBy')
    public void dividedBy(double v) {
        value /= v;
    }

    // Square root (method name 'sqrt')
    public void sqrt() {
        value = Math.sqrt(value);
    }

    // Create a getter to query the state of the Calculator
    public double getValue() {
        return value;
    }

    // Implement a method called reset that returns void,
    // and sets the state of the calculator to zero (0)
    public void reset() {
        value = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaStatefulCalculator that = (JavaStatefulCalculator) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "value=" + value +
                '}';
    }
}
