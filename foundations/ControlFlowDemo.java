package foundations;

public class ControlFlowDemo {

    public static void main(String[] args) {
        System.out.println("=== Control Flow in Java ===\n");

        // --- If-Else Statement ---
        System.out.println("--- If-Else Statement ---");
        int num = 10;

        // Basic if-else
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }

        // Edge case: Testing with Integer.MIN_VALUE
        num = Integer.MIN_VALUE;
        System.out.println("Edge case with Integer.MIN_VALUE: ");
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else {
            System.out.println(num + " is negative or zero.");
        }

        // Tricky case: Check for even or odd
        num = 15;
        System.out.println("Checking if " + num + " is even or odd:");
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        // --- Switch Statement ---
        System.out.println("\n--- Switch Statement ---");
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("Good job!");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better luck next time.");
                break;
            default:
                System.out.println("Invalid grade.");
                break;
        }

        // Edge case: Testing with an unhandled case
        grade = 'E'; // Not defined in switch cases
        System.out.println("Testing with grade 'E':");
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Excellent or Well done!");
                break;
            default:
                System.out.println("Invalid grade.");
                break;
        }

        // Tricky case: Switch with fall-through
        System.out.println("Testing fall-through behavior:");
        int month = 2; // February
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring.");
                break;
            default:
                System.out.println("Not a valid month.");
        }

        // --- For Loop ---
        System.out.println("\n--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Edge case: For loop with unusual increment
        System.out.println("Edge case with unusual increment:");
        for (int i = 0; i < 10; i += 2) { // increments by 2
            System.out.println("i = " + i);
        }

        // Tricky case: Infinite for loop (not advisable to run in production)
        // Uncomment below to see the infinite loop, but be cautious!
        /*
         * for (int i = 0; i >= 0; i++) {
         * System.out.println("This will run forever!");
         * }
         */

        // --- While Loop ---
        System.out.println("\n--- While Loop ---");
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration " + j);
            j++;
        }

        // Edge case: While loop with break
        System.out.println("Edge case: while loop with break:");
        j = 0;
        while (true) {
            if (j >= 5) {
                break; // Break when j reaches 5
            }
            System.out.println("j = " + j);
            j++;
        }

        // Tricky case: While loop that does not terminate
        // Uncomment below to see the non-terminating loop; use cautiously!
        /*
         * int k = 0;
         * while (k < 10) {
         * System.out.println("Infinite while loop, k = " + k);
         * }
         */

        // --- Do-While Loop ---
        System.out.println("\n--- Do-While Loop ---");
        int k = 0;
        do {
            System.out.println("Do-while loop iteration " + k);
            k++;
        } while (k < 5);

        // Edge case: Do-while with false condition
        System.out.println("Do-while with false condition:");
        k = 10;
        do {
            System.out.println("This will execute at least once, k = " + k);
            k++; // Increment k to eventually exit
        } while (k < 5);

        // Tricky case: Do-while loop not executed if k starts at 10
        System.out.println("Do-while that does not run:");
        k = 10;
        do {
            System.out.println("This won't run, k = " + k);
        } while (k < 5); // The condition is false
    }
}
