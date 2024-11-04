package DataStructures;

import java.util.ArrayList;

public class HeapDemo {

    private ArrayList<Integer> heap;
    private boolean isMinHeap;

    // Constructor to initialize the heap and set the type (min-heap or max-heap)
    public HeapDemo(boolean isMinHeap) {
        this.heap = new ArrayList<>();
        this.isMinHeap = isMinHeap;
    }

    // Helper function to get the parent index
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // Helper functions to get left and right child indices
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    // Method to insert a new value into the heap
    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    // Helper method to maintain heap properties after insertion
    private void heapifyUp(int index) {
        int parentIndex = parent(index);
        while (index > 0 && compare(heap.get(index), heap.get(parentIndex))) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = parent(index);
        }
    }

    // Method to remove and return the root of the heap
    public int removeRoot() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int rootValue = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return rootValue;
    }

    // Helper method to maintain heap properties after removal
    private void heapifyDown(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int extreme = index;

        if (left < heap.size() && compare(heap.get(left), heap.get(extreme))) {
            extreme = left;
        }
        if (right < heap.size() && compare(heap.get(right), heap.get(extreme))) {
            extreme = right;
        }

        if (extreme != index) {
            swap(index, extreme);
            heapifyDown(extreme);
        }
    }

    // Comparison logic based on heap type
    private boolean compare(int child, int parent) {
        return isMinHeap ? child < parent : child > parent;
    }

    // Helper method to swap elements in the heap
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Method to display the heap elements
    public void displayHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        // Min-Heap Demo
        System.out.println("Min-Heap Example:");
        HeapDemo minHeap = new HeapDemo(true);
        minHeap.insert(10);
        minHeap.insert(4);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(0);

        System.out.print("Heap after insertions: ");
        minHeap.displayHeap();

        System.out.println("Root removed: " + minHeap.removeRoot());
        System.out.print("Heap after removing root: ");
        minHeap.displayHeap();

        // Max-Heap Demo
        System.out.println("\nMax-Heap Example:");
        HeapDemo maxHeap = new HeapDemo(false);
        maxHeap.insert(10);
        maxHeap.insert(4);
        maxHeap.insert(15);
        maxHeap.insert(20);
        maxHeap.insert(0);

        System.out.print("Heap after insertions: ");
        maxHeap.displayHeap();

        System.out.println("Root removed: " + maxHeap.removeRoot());
        System.out.print("Heap after removing root: ");
        maxHeap.displayHeap();
    }
}
