package GenericsFilesOthers;

import java.io.*; // Import necessary classes for file handling

/**
 * Purpose: Demonstrate basic file operations.
 * Topics: Reading and writing to files using File, FileReader, FileWriter, BufferedReader, BufferedWriter.
 */
public class FileHandlingDemo {

    // Method to write to a file
    public static void writeToFile(String filePath, String content) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing the writer: " + e.getMessage());
            }
        }
    }

    // Method to read from a file
    public static void readFromFile(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("Content of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing the reader: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "example.txt"; // Specify the file path

        // Writing to the file
        String contentToWrite = "Hello, this is a test file.\nWelcome to file handling in Java!";
        writeToFile(filePath, contentToWrite);

        // Reading from the file
        readFromFile(filePath);
    }
}
