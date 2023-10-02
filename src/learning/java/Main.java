package learning.java;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        // Calculate the perimeter -> 2 * PI * radious
        System.out.println(circle.perimeter());
    }

    static Shape doSomethingWiththeShape(Shape s) {
        return new Shape("Blue");
    }
}