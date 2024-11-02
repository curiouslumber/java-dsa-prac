package foundations;

public class DataTypesDemo {

    public static void main(String[] args) {
        System.out.println("=== Data Types in Java ===\n");

        // --- Integer Types ---
        System.out.println("--- Integer Types ---");

        byte byteValue = 127; // Range: -128 to 127
        short shortValue = 32767; // Range: -32,768 to 32,767
        int intValue = 2147483647; // Range: -2^31 to 2^31 - 1
        long longValue = 9223372036854775807L; // Range: -2^63 to 2^63 - 1 (L suffix for long literals)

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);

        // --- Floating-Point Types ---
        System.out.println("\n--- Floating-Point Types ---");

        float floatValue = 3.14159f; // Single-precision (6-7 decimal digits), use 'f' suffix
        double doubleValue = 3.14159265358979323846; // Double-precision (15 decimal digits), default for floating-point
                                                     // literals

        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        // Special floating-point values
        System.out.println("Float Positive Infinity: " + Float.POSITIVE_INFINITY);
        System.out.println("Float NaN (Not a Number): " + Float.NaN);

        // --- Character Type ---
        System.out.println("\n--- Character Type ---");

        char charValue = 'A';
        char unicodeChar = '\u0041'; // Unicode character for 'A'

        System.out.println("char: " + charValue);
        System.out.println("unicode char: " + unicodeChar);

        // --- Boolean Type ---
        System.out.println("\n--- Boolean Type ---");

        boolean boolTrue = true;
        boolean boolFalse = false;

        System.out.println("boolean true: " + boolTrue);
        System.out.println("boolean false: " + boolFalse);

        // --- Wrapper Classes ---
        System.out.println("\n--- Wrapper Classes ---");

        Integer integerWrapper = Integer.valueOf(123);
        Double doubleWrapper = Double.valueOf(3.14159);
        Boolean booleanWrapper = Boolean.valueOf(true);

        System.out.println("Integer wrapper: " + integerWrapper);
        System.out.println("Double wrapper: " + doubleWrapper);
        System.out.println("Boolean wrapper: " + booleanWrapper);

        // --- Type Casting ---
        System.out.println("\n--- Type Casting ---");

        // Implicit Casting (widening)
        int num = 100;
        long widenedNum = num; // int to long (widening conversion)

        System.out.println("Implicitly cast int to long: " + widenedNum);

        // Explicit Casting (narrowing)
        double decimalNum = 99.99;
        int narrowedNum = (int) decimalNum; // double to int (narrowing conversion)

        System.out.println("Explicitly cast double to int: " + narrowedNum);

        // --- Final Variables (Constants) ---
        System.out.println("\n--- Final Variables (Constants) ---");

        final int MAX_AGE = 120; // Value cannot be changed
        System.out.println("Max age constant: " + MAX_AGE);

        // --- Special Considerations ---
        System.out.println("\n--- Special Considerations ---");

        // Integer Overflow
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max Integer: " + maxInt);
        System.out.println("Max Integer + 1 (Overflow): " + (maxInt + 1)); // Overflow behavior

        // Floating-point precision loss
        double preciseDouble = 0.1 + 0.2;
        System.out.println("Expected 0.3, but got: " + preciseDouble); // Precision loss example

        // Byte and short arithmetic promotion
        byte byte1 = 50;
        byte byte2 = 50;
        // Uncommenting the below line will cause a compile-time error because byte1 +
        // byte2 results in an int
        // byte result = byte1 + byte2;
        int result = byte1 + byte2; // Automatic promotion to int for arithmetic operations
        System.out.println("Result of byte addition (promoted to int): " + result);

        // --- Default Values (for instance variables only) ---
        System.out.println("\n--- Default Values (for instance variables only) ---");

        // In Java, local variables (such as those defined in main) do not have default
        // values.
        // Uncommenting the below line will result in a compile-time error:
        // int defaultInt;
        // System.out.println(defaultInt); // Error: variable defaultInt might not have
        // been initialized
    }
}