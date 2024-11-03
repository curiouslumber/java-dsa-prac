package GenericsFilesOthers;

import java.util.ArrayList;
import java.util.List;

// ModuleDemo class to showcase the use of Java modules
public class ModulesDemo {

    // Main method to execute the demonstration
    public static void main(String[] args) {
        // Create an instance of the ModuleDemo class
        ModulesDemo demo = new ModulesDemo();

        // Call the method to demonstrate module functionality
        demo.displayModules();
    }

    // Method to demonstrate the organization of modules
    public void displayModules() {
        // Simulating a module that manages a list of items
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");

        // Display the items
        System.out.println("Items in the module:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}

// Create a module-info.java file in the same package for this module
/*
 * module GenericsFilesOthers {
 * // Exports the GenericsFilesOthers package for use by other modules
 * exports GenericsFilesOthers;
 * }
 */
