package learning.java;

public class Shape {
    private final String color;
    private final int numberOfSides;

    public Shape(String c) {
        this(c, 0);
        //System.out.println("CAlled the 1 parameter constructor");
    }

    public Shape(String c, int n) {
        color = c;
        numberOfSides = n;
        //System.out.println("CAlled the 2 parameters constructor");
    }

    public String toString() {
        return "Shape(" + color + ", " + numberOfSides + ")";
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public Shape copy(Shape anotherShape) {
        return new Shape(anotherShape.getColor(), anotherShape.getNumberOfSides());
    }


}

