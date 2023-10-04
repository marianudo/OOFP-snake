package learning.java;

public class Square extends Shape {
    // First we define the attributes (also called members) of the class;
    // Those will hold the state of this class instances (objects)
    // We make them private and final to enforce immutability

    private int sideLength = 0;

    // Constructor that allows us to instantiate Square objects with a given side length
    public Square(int sideLength) {
        // When we use in a method parameter the same name of a class attribute, that is called shadowing
        // When shadowing, we have two different variables in scope with the same name
        // We can still access the class attribute using the keyword "this" as a pointer to the current object
        super(defaultColor, sideLength);
    }

    // Following industry standard conventions; after the contructor, we define getters
    // (only if we want the outer world to have access to the state of the object
    // aka, the values of the class attributes for this particular object)

    // After getters, we define methods for the logic (behaviour) we want our class to provide
    public int perimeter() {
        return sideLength * 4;
    }

    // Finally, we provide a toString implementation so our objects are able to give a textual
    // description of themselves
    public String toString() {
        return "Square(sideLength = " + sideLength + ")";
    }

    public void draw() {
        System.out.println("I'm a square with a side of length " + sideLength);
    }
}
