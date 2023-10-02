package learning.java;
// Solution to Mariano's assignment:
// Implement a Triangle class.
// For the sake of simplicity, we will assume that our triangle is equilateral
// (all sides have the same length)
// Guidelines:
// 1. Make objects (instances) of the Triangle class immutable)
// 2. Force code using the Triangle class to give the state (side length) of the object at construction time
// 3. Provide a getter for the side length Triangle class attribute
// 4. Implement a perimeter method that returns the perimeter of the Triangle object.
// 5. Provide a toString method that returns a textual representation of the state of the Triangle instance
public class Triangle {
    // 1. First, we make the state of our Triangle immutable
    private final int sideLength;

    // 2. Now we force the code using the Triangle class to provide a state for each new Triangle object
    // at construction time. For that, we define a constructor that takes that state as a parameter
    // and assigns it to this class attribute sideLength
    public Triangle(int sideLength) {
        this.sideLength = sideLength;
    }

    // 3. We now provide the getter
    public int getSideLength() {
        return sideLength;
    }

    // 4. The perimeter method
    public int perimeter() {
        // An Equilateral triangle has a perimeter that is 3 times the side length
        // (All sides are equal, and a triangle has 3 sides)
        return 3 * sideLength;
    }

    // 5. Finally, the toString method
    public String toString() {
        return "Triangle(sideLength=" + sideLength + ")";
    }
}
