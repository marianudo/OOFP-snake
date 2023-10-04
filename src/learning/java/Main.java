package learning.java;

public class Main {
    public static void main(String[] args) {
        Shape shape = Shape.shapeFactory(); // Polymorphism - dynamic binding
        Canvas canvas = new Canvas();
        canvas.draw(shape);
    }
}