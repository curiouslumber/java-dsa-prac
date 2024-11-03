package DataStructures;

public class LinkedListDemo {

    // Node class representing each element in the LinkedList
    static class Node {
        int data; // Data stored in the node
        Node next; // Pointer to the next node
        Node prev; // Pointer to the previous node

        Node(int data) {
            this.data = data;
        }
    }

    // LinkedList class with basic operations
    static class LinkedList {
        Node head; // Head of the list

        // Insert a new node at the end of the list
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode; // If list is empty, set head to new node
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next; // Traverse to the last node
                }
                current.next = newNode; // Link the new node at the end
                newNode.prev = current; // Link the previous node to new node
            }
        }

        // Delete a node from the list
        public void delete(int data) {
            Node current = head;

            // Traverse to find the node to be deleted
            while (current != null) {
                if (current.data == data) {
                    if (current.prev != null) {
                        current.prev.next = current.next; // Bypass the current node
                    } else {
                        head = current.next; // Update head if first node is deleted
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev; // Bypass the current node
                    }
                    return; // Node deleted
                }
                current = current.next;
            }
        }

        // Display the linked list
        public void display() {
            Node current = head;
            System.out.print("LinkedList: ");
            while (current != null) {
                System.out.print(current.data + " <=> "); // Print node data
                current = current.next; // Move to the next node
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting elements into the LinkedList
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // Display the list

        // Deleting an element
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display(); // Display the list again
    }
}