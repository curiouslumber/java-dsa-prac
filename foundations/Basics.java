package foundations;

class Basics {

    public static void main(String[] args) {
        // Basic Output
        System.out.println("Hello World!");

        // --- Primitive Data Types ---
        System.out.println("\n--- Primitive Data Types ---");

        // Integer types
        byte byteVal = 127;
        short shortVal = 32767;
        int intVal = 2147483647;
        long longVal = 9223372036854775807L;

        // Floating-point types
        float floatVal = 3.14f;
        double doubleVal = 3.14159265359;

        // Character type
        char charVal = 'A';

        // Boolean type
        boolean boolVal = true;

        // Print all values
        System.out.println("Byte Value: " + byteVal);
        System.out.println("Short Value: " + shortVal);
        System.out.println("Int Value: " + intVal);
        System.out.println("Long Value: " + longVal);
        System.out.println("Float Value: " + floatVal);
        System.out.println("Double Value: " + doubleVal);
        System.out.println("Char Value: " + charVal);
        System.out.println("Boolean Value: " + boolVal);

        // --- Basic Operators ---
        System.out.println("\n--- Basic Operators ---");

        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // --- Control Flow Statements ---
        System.out.println("\n--- Control Flow Statements ---");

        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            default:
                System.out.println("Keep trying!");
        }

        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        // --- Garbage Collection Concept ---
        System.out.println("\n--- Garbage Collection Concept ---");

        {
            Basics basics = new Basics(); // Creating an object
            System.out.println("Object created: " + basics);
            // 'basics' reference goes out of scope after this block, making the object eligible for GC
        }

        System.gc(); // Request garbage collection
        System.out.println("Requested garbage collection.");
    }
}
