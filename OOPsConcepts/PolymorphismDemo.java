package OOPsConcepts;

class Animal {
    // No-argument constructor
    public Animal() {
        System.out.println("Animal constructor called");
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // No-argument constructor
    public Dog() {
        System.out.println("Dog constructor called");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
    
    // Method with different parameter types to demonstrate overloading
    public void sound(String soundType) {
        System.out.println("Dog makes a " + soundType + " sound");
    }
}

class Cat extends Animal {
    // No-argument constructor
    public Cat() {
        System.out.println("Cat constructor called");
    }

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // 1. Runtime Polymorphism (Method Overriding)
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();  // Dog is treated as an Animal
        Animal myCat = new Cat();  // Cat is treated as an Animal
        
        System.out.println("Runtime Polymorphism (Method Overriding):");
        myAnimal.sound();  // Calls Animal's version
        myDog.sound();     // Calls Dog's version
        myCat.sound();     // Calls Cat's version
        
        // 2. Compile-Time Polymorphism (Method Overloading)
        Dog specificDog = new Dog();
        
        System.out.println("\nCompile-Time Polymorphism (Method Overloading):");
        specificDog.sound();           // Calls no-arg sound() in Dog
        specificDog.sound("growling");  // Calls overloaded sound(String) in Dog

        // 3. Casting Objects - Downcasting and Upcasting
        System.out.println("\nObject Casting:");
        Animal genericDog = new Dog(); // Upcasting (implicit)
        ((Dog) genericDog).sound("barking"); // Downcasting to call overloaded method

        // 4. Polymorphism with Arrays
        Animal[] animals = { new Dog(), new Cat(), new Animal() };
        
        System.out.println("\nPolymorphism in Arrays:");
        for (Animal animal : animals) {
            animal.sound();  // Each object uses its overridden sound method
        }

        // 5. Edge Cases: Null References in Polymorphism
        System.out.println("\nNull References:");
        Animal nullAnimal = null;
        try {
            nullAnimal.sound(); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call sound() on a null reference");
        }

        // 6. Edge Case: Overloading with Primitive and Wrapper Types
        System.out.println("\nOverloading with Primitive and Wrapper Types:");
        primitiveVsWrapperOverload(5);                // Calls primitive int overload
        primitiveVsWrapperOverload(new Integer(5));   // Calls wrapper Integer overload
    }

    // Overloading with primitive and wrapper to demonstrate nuances
    public static void primitiveVsWrapperOverload(int num) {
        System.out.println("Called method with int: " + num);
    }

    public static void primitiveVsWrapperOverload(Integer num) {
        System.out.println("Called method with Integer: " + num);
    }
}