package OOPsConcepts;

/**
 * Purpose: Focus on abstraction in Java.
 * Topics: Abstract classes, abstract methods, and interfaces.
 */

public class AbstractionDemo {
    public static void main(String[] args) {
        // Instantiating subclasses to demonstrate abstraction
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle area: " + circle.calculateArea());      // Area based on implementation in Circle
        System.out.println("Rectangle area: " + rectangle.calculateArea()); // Area based on implementation in Rectangle

        // Using interfaces
        Printable printableCircle = new Circle(5.0);
        printableCircle.print(); // Prints Circle details as per the implementation in Circle

        Printable printableRectangle = new Rectangle(4.0, 6.0);
        printableRectangle.print(); // Prints Rectangle details as per the implementation in Rectangle
    }
}

/**
 * Abstract class Shape demonstrates abstraction by:
 * 1. Declaring an abstract method `calculateArea()` that subclasses must implement.
 * 2. Including a common field `name` and a concrete method `getName()` that can be used by all subclasses.
 */
abstract class Shape {
    protected String name; // Common field for subclasses

    // Abstract method (no body), must be implemented by subclasses
    public abstract double calculateArea();

    // Concrete method that returns the name of the shape
    public String getName() {
        return name;
    }
}

/**
 * Circle is a concrete subclass of Shape that implements the abstract method `calculateArea`.
 */
class Circle extends Shape implements Printable {
    private double radius;

    // Constructor initializes the Circle-specific properties
    public Circle(double radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    // Implementation of the abstract method from Shape
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of the print method from Printable interface
    @Override
    public void print() {
        System.out.println(getName() + " with radius " + radius + " has area: " + calculateArea());
    }
}

/**
 * Rectangle is a concrete subclass of Shape that implements the abstract method `calculateArea`.
 */
class Rectangle extends Shape implements Printable {
    private double length;
    private double width;

    // Constructor initializes the Rectangle-specific properties
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.name = "Rectangle";
    }

    // Implementation of the abstract method from Shape
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementation of the print method from Printable interface
    @Override
    public void print() {
        System.out.println(getName() + " with length " + length + " and width " + width + " has area: " + calculateArea());
    }
}

/**
 * Interface Printable represents a contract for any class that needs a `print` functionality.
 * Classes implementing this interface must provide an implementation of the `print` method.
 */
interface Printable {
    void print(); // Abstract method in the interface
}