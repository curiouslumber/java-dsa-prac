package OOPsConcepts;

/**
 * Purpose: Showcase encapsulation principles.
 * Topics: Private fields, public getters/setters, immutability, and data hiding.
 */

public class EncapsulationDemo {

    public static void main(String[] args) {
        // Creating an instance of the encapsulated class
        Person person = new Person("Alice", 25);

        // Accessing data via getters and setters
        System.out.println("Name: " + person.getName());       // Output: Name: Alice
        System.out.println("Age: " + person.getAge());         // Output: Age: 25

        // Modifying data through setters
        person.setAge(26);
        System.out.println("Updated Age: " + person.getAge()); // Output: Updated Age: 26

        // Attempt to modify an immutable field
        // person.setName("Bob");
        System.out.println("Updated Name: " + person.getName()); // Output: Name: Alice
    }
}

/**
 * Person class demonstrates encapsulation by:
 * 1. Using private fields to prevent direct access.
 * 2. Providing public getters and setters to control access.
 * 3. Applying immutability where needed by removing setters for certain fields.
 */
class Person {
    // Private fields: Only accessible within the Person class
    private final String name; // Immutable field (no setter)
    private int age;           // Mutable field (setter available)

    // Constructor to initialize fields
    public Person(String name, int age) {
        this.name = name;      // Name is assigned once and made immutable
        this.age = age;
    }

    // Getter for name (no setter to enforce immutability)
    public String getName() {
        return name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {         // Basic validation to hide negative values
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be positive.");
        }
    }

    // No setter for `name` means it cannot be changed after object creation, ensuring immutability.
}