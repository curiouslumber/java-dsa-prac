package DataStructures;

public class BinarySearchTreeDemo {

    // Node class representing each node in the BST
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    private Node root;

    // Method to insert a new node in the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(value);
            return root;
        }
        // Otherwise, recur down the tree
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }
        // Return the unchanged node pointer
        return root;
    }

    // Method to search for a node in the BST
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        // Base case: if the root is null or value is present at root
        if (root == null) {
            return false;
        }
        if (root.data == value) {
            return true;
        }
        // Value is greater than root's data
        if (value < root.data) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

    // Method to perform in-order traversal
    public void inOrder() {
        System.out.print("In-order traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    // Method to delete a node from the BST
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        // Base case: if the tree is empty
        if (root == null) {
            return root;
        }
        // Recur down the tree
        if (value < root.data) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.data) {
            root.right = deleteRec(root.right, value);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    // Helper method to find the minimum value in a given subtree
    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    // Main method to demonstrate binary search tree operations
    public static void main(String[] args) {
        BinarySearchTreeDemo bst = new BinarySearchTreeDemo();

        // Inserting nodes into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Displaying the tree
        bst.inOrder();

        // Searching for values
        System.out.println("Searching for 40: " + bst.search(40));  // Expected output: true
        System.out.println("Searching for 90: " + bst.search(90));  // Expected output: false

        // Deleting a node
        System.out.println("Deleting node with value 20");
        bst.delete(20);
        bst.inOrder();

        System.out.println("Deleting node with value 30");
        bst.delete(30);
        bst.inOrder();

        System.out.println("Deleting node with value 50");
        bst.delete(50);
        bst.inOrder();
    }
}