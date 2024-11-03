package OOPsConcepts;

/**
 * Purpose: Explain exception handling and error management.
 * Topics: try-catch blocks, finally, throws, throw, checked and unchecked exceptions, and custom exceptions.
 */
public class ExceptionHandlingDemo {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        // Basic try-catch example with finally
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This will always execute regardless of exception.");
        }

        // Handling checked exceptions with throws
        try {
            readFile("nonexistent.txt");
        } catch (Exception e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        }

        // Demonstrating custom exceptions
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        // Handling unchecked exceptions (NullPointerException example)
        try {
            String str = null;
            System.out.println("Length of string: " + str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // Method demonstrating 'throws' for checked exception
    public static void readFile(String fileName) throws Exception {
        throw new Exception("File not found: " + fileName); // Simulates a checked exception
    }

    // Method to demonstrate 'throw' with custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        } else {
            System.out.println("Valid age for registration.");
        }
    }

    // Method to demonstrate try-catch for handling exceptions
    public static int divide(int a, int b) {
        return a / b; // Will throw ArithmeticException if b is zero
    }
}

/**
 * Custom exception to demonstrate creating user-defined exceptions.
 */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Passing message to the parent Exception class
    }
}
