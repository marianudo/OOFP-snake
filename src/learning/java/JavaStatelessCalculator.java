package learning.java;

import java.util.Objects;

public class JavaStatelessCalculator {
    private final double value;

    public JavaStatelessCalculator(double value) {
        this.value = value;
    }

    public JavaStatelessCalculator sum(double v) {
        return new JavaStatelessCalculator(this.value + v);
    }

    // TODO To be implemented by student
    public JavaStatelessCalculator minus(double v) {
        return null;
    }

    // TODO To be implemented by student
    public JavaStatelessCalculator times(double v) {
        return null;
    }

    // TODO To be implemented by student
    public JavaStatelessCalculator divideBy(double v) {
        return null;
    }

    // TODO To be implemented by student
    public JavaStatelessCalculator sqrt() {
        return null;
    }
    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaStatelessCalculator that = (JavaStatelessCalculator) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "JavaStatelessCalculator{" +
                "value=" + value +
                '}';
    }
}
