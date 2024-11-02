package foundations;

// Define a simple class representing a "Car" object
public class ClassesAndObjects {

    public static void main(String[] args) {
        // Creating Car objects using different constructors
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Accord");
        Car car3 = new Car();

        // Accessing fields and methods
        System.out.println(car1); // Calls toString() method
        System.out.println("Car 1 Age: " + car1.calculateAge());

        System.out.println(car2);
        car2.setModel("Civic"); // Using a setter to modify encapsulated data
        System.out.println("Updated Car 2: " + car2);

        System.out.println(car3);
        car3.setMake("Ford");
        car3.setModel("Fusion");
        car3.setYear(2019);
        System.out.println("Updated Car 3: " + car3);

        // Demonstrating method overloading
        car1.start();
        car1.start("Fast");

        // Demonstrating use of 'this' keyword
        System.out.println("Car 1 description: " + car1.getDescription());
    }
}

class Car {
    // Fields (attributes) of the Car class
    private String make;
    private String model;
    private int year;

    // Static field to track total number of Car objects created
    private static int carCount = 0;

    // Default constructor
    public Car() {
        this("Unknown", "Unknown", 2000); // Calls another constructor using 'this'
    }

    // Constructor with make and model
    public Car(String make, String model) {
        this(make, model, 2000); // Calls the main constructor with a default year
    }

    // Constructor with make, model, and year
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        carCount++; // Increment car count every time a new Car object is created
    }

    // Getter for car count (static method)
    public static int getCarCount() {
        return carCount;
    }

    // Getters and setters for encapsulated fields
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885 && year <= 2025) { // Basic validation on the year
            this.year = year;
        } else {
            System.out.println("Invalid year. Setting to default 2000.");
            this.year = 2000;
        }
    }

    // Example of an instance method
    public int calculateAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - this.year;
    }

    // Overloaded 'start' method with different parameters
    public void start() {
        System.out.println(make + " " + model + " is starting.");
    }

    public void start(String speed) {
        System.out.println(make + " " + model + " is starting at " + speed + " speed.");
    }

    // Using 'this' keyword to refer to instance variables
    public String getDescription() {
        return "Car [make=" + this.make + ", model=" + this.model + ", year=" + this.year + "]";
    }

    // Overriding the toString() method for better object representation
    @Override
    public String toString() {
        return "Car [Make: " + make + ", Model: " + model + ", Year: " + year + "]";
    }
}
