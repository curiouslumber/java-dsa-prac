package DataStructures;

import java.util.HashMap;

public class TrieDemo {

    // TrieNode represents each node in the Trie
    private static class TrieNode {
        HashMap<Character, TrieNode> children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }

    private final TrieNode root;

    // Constructor initializes the Trie with a root node
    public TrieDemo() {
        root = new TrieNode();
    }

    // Method to insert a word into the Trie
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    // Method to search for a complete word in the Trie
    public boolean search(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current = current.children.get(ch);
            if (current == null) {
                return false;
            }
        }
        return current.isEndOfWord;
    }

    // Method to check if there is any word in the Trie that starts with a given prefix
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            current = current.children.get(ch);
            if (current == null) {
                return false;
            }
        }
        return true;
    }

    // Method to display all words stored in the Trie (for demonstration)
    public void display() {
        displayHelper(root, "");
    }

    // Recursive helper to gather and print all words in Trie
    private void displayHelper(TrieNode node, String word) {
        if (node.isEndOfWord) {
            System.out.println(word);
        }
        for (char ch : node.children.keySet()) {
            displayHelper(node.children.get(ch), word + ch);
        }
    }

    public static void main(String[] args) {
        TrieDemo trie = new TrieDemo();

        // Inserting words into the Trie
        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");
        trie.insert("bat");
        trie.insert("batch");
        trie.insert("batman");

        // Searching for words
        System.out.println("Search 'app': " + trie.search("app")); // true
        System.out.println("Search 'apple': " + trie.search("apple")); // true
        System.out.println("Search 'bat': " + trie.search("bat")); // true
        System.out.println("Search 'batman': " + trie.search("batman")); // true
        System.out.println("Search 'batmobile': " + trie.search("batmobile")); // false

        // Checking for prefixes
        System.out.println("Starts with 'ap': " + trie.startsWith("ap")); // true
        System.out.println("Starts with 'batm': " + trie.startsWith("batm")); // true
        System.out.println("Starts with 'cat': " + trie.startsWith("cat")); // false

        // Displaying all words in the Trie
        System.out.println("Words in Trie:");
        trie.display();
    }
}