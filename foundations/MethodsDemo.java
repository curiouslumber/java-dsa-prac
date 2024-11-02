package foundations;

public class MethodsDemo {

    public static void main(String[] args) {
        System.out.println("=== Methods in Java ===\n");

        // Simple Method Call
        greetUser();

        // Method with Parameters and Return Type
        int sumResult = add(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sumResult);

        // Method Overloading
        System.out.println("\n--- Method Overloading ---");
        System.out.println("Sum of two integers: " + add(5, 15));
        System.out.println("Sum of three integers: " + add(5, 10, 15));
        System.out.println("Concatenation of two strings: " + add("Hello", " World"));

        // Pass by Value
        System.out.println("\n--- Pass by Value ---");
        int original = 10;
        modifyValue(original);
        System.out.println("Original value after method call: " + original);

        // Recursion Example
        System.out.println("\n--- Recursion ---");
        int factorialResult = factorial(5);
        System.out.println("Factorial of 5 is: " + factorialResult);

        // Variable Arguments (Varargs)
        System.out.println("\n--- Variable Arguments (Varargs) ---");
        printNumbers(1, 2, 3, 4, 5);

        // Access Modifiers in Methods
        System.out.println("\n--- Access Modifiers in Methods ---");
        MethodsDemo demo = new MethodsDemo();
        demo.privateMethod(); // Accessed within the same class
        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
    }

    // Simple Method with No Return Value
    public static void greetUser() {
        System.out.println("Hello, User!");
    }

    // Method with Parameters and Return Type
    public static int add(int a, int b) {
        return a + b;
    }

    // Method Overloading: Different Parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method Overloading: Different Data Type
    public static String add(String a, String b) {
        return a + b;
    }

    // Pass by Value Example
    public static void modifyValue(int x) {
        x = x * 10;
        System.out.println("Value inside method: " + x); // Shows modified value inside method only
    }

    // Recursive Method
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Variable Arguments (Varargs)
    public static void printNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Access Modifiers in Methods
    private void privateMethod() {
        System.out.println("Private method called. Only accessible within this class.");
    }

    public void publicMethod() {
        System.out.println("Public method called. Accessible from anywhere.");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called. Accessible within package and subclasses.");
    }

    void defaultMethod() {
        System.out.println("Default method called. Accessible within the same package.");
    }
}