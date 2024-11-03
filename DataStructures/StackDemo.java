package DataStructures;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack after pushing elements: " + stack);

        // Peek at the top element
        String topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        // Pop the top element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping an element: " + stack);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Displaying the current size of the stack
        System.out.println("Current stack size: " + stack.size());

        // Pop all elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popping: " + stack.pop());
        }
        System.out.println("Stack after popping all elements: " + stack);
    }
}
