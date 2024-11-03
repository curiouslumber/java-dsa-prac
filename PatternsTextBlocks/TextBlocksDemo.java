package PatternsTextBlocks;

public class TextBlocksDemo {

    public static void main(String[] args) {
        // Demonstrating the usage of text blocks for multi-line strings

        // Example of a simple text block
        String multiLineString = """
                This is a text block.
                It can span multiple lines
                without the need for escape sequences.
                """;
        System.out.println("Simple Text Block:");
        System.out.println(multiLineString);

        // Example of a text block with JSON
        String jsonTextBlock = """
                {
                    "name": "John Doe",
                    "age": 30,
                    "city": "New York"
                }
                """;
        System.out.println("JSON Example:");
        System.out.println(jsonTextBlock);

        // Example of a text block with SQL
        String sqlTextBlock = """
                SELECT *
                FROM users
                WHERE age > 25
                ORDER BY name;
                """;
        System.out.println("SQL Example:");
        System.out.println(sqlTextBlock);

        // Demonstrating escaping sequences in text blocks
        String escapedTextBlock = """
                This text block contains an escaped quote: \"Hello, World!\"
                And also a backslash: \\\\.
                """;
        System.out.println("Escaped Sequences Example:");
        System.out.println(escapedTextBlock);
    }
}