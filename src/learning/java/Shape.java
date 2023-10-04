package learning.java;

public abstract class Shape {

    protected final static String defaultColor = "Transparent";
    private final String color;
    private final int numberOfSides;

    public Shape() {
        this(defaultColor);
    }
    public Shape(String c) {
        this(c, 0);
        //System.out.println("CAlled the 1 parameter constructor");
    }

    public Shape(String c, int n) {
        color = c;
        numberOfSides = n;
        System.out.println("Called the 2 parameters constructor");
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

    public abstract void draw();

    public static Shape shapeFactory() {
        return new Square(3);
    }

    public abstract void perimeter();
}

