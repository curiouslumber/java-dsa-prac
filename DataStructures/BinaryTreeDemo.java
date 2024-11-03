package DataStructures;

public class BinaryTreeDemo {

    // Node class representing each node in the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    private Node root;

    // Method to insert a new node in the binary tree
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
        // Return the (unchanged) node pointer
        return root;
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

    // Method to perform pre-order traversal
    public void preOrder() {
        System.out.print("Pre-order traversal: ");
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Method to perform post-order traversal
    public void postOrder() {
        System.out.print("Post-order traversal: ");
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Method to delete a node from the binary tree
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        // Base case: If the tree is empty
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
            // Node with two children: Get the inorder successor (smallest in the right
            // subtree)
            root.data = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    // Helper method to find the minimum value in a given tree
    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    // Main method to demonstrate binary tree operations
    public static void main(String[] args) {
        BinaryTreeDemo tree = new BinaryTreeDemo();

        // Inserting nodes into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Displaying the tree
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();

        // Deleting a node
        System.out.println("Deleting node with value 20");
        tree.delete(20);
        tree.inOrder();

        System.out.println("Deleting node with value 30");
        tree.delete(30);
        tree.inOrder();

        System.out.println("Deleting node with value 50");
        tree.delete(50);
        tree.inOrder();
    }
}
