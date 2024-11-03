package GenericsFilesOthers;

import java.util.ArrayList;
import java.util.List;

// Record class to demonstrate immutable data carriers
record Person(String name, int age) {
    // The constructor is automatically created for records
}

// Main class to demonstrate the usage of records
public class RecordsDemo {

    // Main method to execute the demonstration
    public static void main(String[] args) {
        // Creating an instance of the Person record
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Displaying the details of the records
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        // Using records in a collection
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);

        // Displaying the details of all persons in the collection
        System.out.println("\nList of Persons:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}