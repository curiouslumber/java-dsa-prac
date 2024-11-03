package Patterns;

public class PatternMatchingDemo {

    public static void main(String[] args) {
        // Demonstrating instanceof pattern matching
        Object obj = "Hello, Java 21!"; // This can be any Object type

        // Using instanceof to check type and cast in one step
        if (obj instanceof String str) {
            System.out.println("The object is a String with length: " + str.length());
        } else {
            System.out.println("The object is not a String.");
        }

        // Demonstrating switch expression enhancements
        char grade = 'B';
        String result = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Well done";
            case 'C' -> "Good";
            case 'D' -> "You passed";
            case 'F' -> "Better luck next time";
            default -> "Invalid grade";
        };
        System.out.println("Your grade: " + grade + " - Result: " + result);

        // Example use case with pattern matching in switch statements
        // Object anotherObj = 42; // This can be any Object type

        // Below only available in Java 21 and above
        // String response = switch (anotherObj) {
        //     case String s -> "String value: " + s;
        //     case Integer i -> "Integer value: " + i;
        //     case Double d -> "Double value: " + d;
        //     default -> "Unknown type";
        // };
        // System.out.println("The anotherObj is: " + response);
    }
}