package learning.java;

public class Circle {
    private final int radious;

    public Circle(int r) {
        radious = r;
    }


    public int getRadious() {
        return radious;
    }

    public double perimeter() {
        return 2 * Math.PI * radious;
    }
}
