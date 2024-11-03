package OOPsConcepts;

// Main class to demonstrate inheritance concepts
public class InheritanceDemo {
    public static void main(String[] args) {
        // Demonstrating single inheritance and method overriding
        Dog dog = new Dog("Golden Retriever", 5);
        dog.eat(); // Calls the overridden method in Dog
        dog.sleep(); // Calls the inherited method from Animal
        dog.bark(); // Calls method unique to Dog

        // Demonstrating polymorphism
        Animal animal = new Dog("Poodle", 3);
        animal.eat(); // Calls Dog's eat() method due to polymorphism
        // animal.bark(); // Error: Animal reference can't call methods only in Dog

        // Demonstrating access to parent class properties and methods
        System.out.println("Animal type: " + dog.getType());

        // Demonstrating use of 'super' in constructor chaining
        Cat cat = new Cat("Persian", 2);
        cat.eat();
        cat.sleep();

        // Edge case: Using `super` keyword to access parent’s overridden methods
        dog.callParentEat();
    }
}

// Base class 'Animal'
class Animal {
    private String type;  // Encapsulated field, accessible via getter

    // Constructor
    public Animal(String type) {
        this.type = type;
        System.out.println("Animal constructor called.");
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Method for eating (can be overridden by subclasses)
    public void eat() {
        System.out.println(type + " is eating.");
    }

    // Method for sleeping (not overridden in subclasses)
    public void sleep() {
        System.out.println(type + " is sleeping.");
    }
}

// Derived class 'Dog' inheriting from 'Animal'
class Dog extends Animal {
    private int age;

    // Constructor
    public Dog(String type, int age) {
        super(type);  // Calls the constructor of the superclass (Animal)
        this.age = age;
        System.out.println("Dog constructor called.");
    }

    // Overriding the eat() method
    @Override
    public void eat() {
        System.out.println(getType() + " (Dog) is eating.");
    }

    // Unique method in Dog class
    public void bark() {
        System.out.println(getType() + " is barking.");
    }

    // Method demonstrating use of 'super' keyword to call the superclass's overridden method
    public void callParentEat() {
        super.eat();  // Calls the eat() method in Animal
    }

    // Method using age
    public void displayAge() {
        System.out.println(getType() + " is " + age + " years old.");
    }
}

// Derived class 'Cat' inheriting from 'Animal'
class Cat extends Animal {
    private int age;

    // Constructor
    public Cat(String type, int age) {
        super(type);  // Calls the constructor of the superclass (Animal)
        this.age = age;
        System.out.println("Cat constructor called.");
    }

    // Overriding the eat() method
    @Override
    public void eat() {
        System.out.println(getType() + " (Cat) is eating gracefully.");
    }

    // Method using age
    public void displayAge() {
        System.out.println(getType() + " is " + age + " years old.");
    }
}