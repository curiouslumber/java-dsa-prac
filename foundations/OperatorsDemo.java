package foundations;

public class OperatorsDemo {

    public static void main(String[] args) {
        System.out.println("=== Operators in Java ===\n");

        // --- Arithmetic Operators ---
        System.out.println("--- Arithmetic Operators ---");
        int a = 10, b = 3;
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // --- Unary Operators ---
        System.out.println("\n--- Unary Operators ---");
        int c = 5;
        System.out.println("Initial value of c: " + c);
        System.out.println("Unary plus (+c): " + (+c));
        System.out.println("Unary minus (-c): " + (-c));

        System.out.println("Increment (c++): " + (c++)); // Post-increment
        System.out.println("Value of c after post-increment: " + c);

        System.out.println("Decrement (--c): " + (--c)); // Pre-decrement

        // --- Relational Operators ---
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // --- Logical Operators ---
        System.out.println("\n--- Logical Operators ---");
        boolean x = true, y = false;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // --- Bitwise Operators ---
        System.out.println("\n--- Bitwise Operators ---");
        int m = 5; // Binary: 0101
        int n = 3; // Binary: 0011
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m & n (AND): " + (m & n)); // Bitwise AND
        System.out.println("m | n (OR): " + (m | n)); // Bitwise OR
        System.out.println("m ^ n (XOR): " + (m ^ n)); // Bitwise XOR
        System.out.println("~m (NOT): " + (~m)); // Bitwise NOT

        // --- Shift Operators ---
        System.out.println("\n--- Shift Operators ---");
        int p = 16; // Binary: 0001 0000
        System.out.println("p = " + p);
        System.out.println("p << 2 (Left Shift): " + (p << 2)); // Left shift
        System.out.println("p >> 2 (Right Shift): " + (p >> 2)); // Right shift
        System.out.println("p >>> 2 (Unsigned Right Shift): " + (p >>> 2)); // Unsigned right shift

        // --- Assignment Operators ---
        System.out.println("\n--- Assignment Operators ---");
        int d = 10;
        System.out.println("d = " + d);

        d += 5; // Equivalent to d = d + 5
        System.out.println("d += 5: " + d);

        d -= 3; // Equivalent to d = d - 3
        System.out.println("d -= 3: " + d);

        d *= 2; // Equivalent to d = d * 2
        System.out.println("d *= 2: " + d);

        d /= 4; // Equivalent to d = d / 4
        System.out.println("d /= 4: " + d);

        d %= 3; // Equivalent to d = d % 3
        System.out.println("d %= 3: " + d);

        d |= 2; // Bitwise OR assignment (d = d | 2)
        System.out.println("d |= 2: " + d);

        // --- Ternary Operator ---
        System.out.println("\n--- Ternary Operator ---");
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age = " + age + ", Category: " + result);

        // --- Instanceof Operator ---
        System.out.println("\n--- instanceof Operator ---");
        String name = "Java";
        System.out.println("Is 'name' an instance of String? " + (name instanceof String));
    }
}