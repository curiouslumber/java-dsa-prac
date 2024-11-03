package DataStructures;

import java.util.*;

public class GraphDemo {

    private Map<Integer, List<Integer>> adjacencyList;

    // Constructor
    public GraphDemo() {
        adjacencyList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an edge to the graph
    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // For undirected graph
    }

    // Depth First Search (DFS)
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal starting from vertex " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");
        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // Breadth First Search (BFS)
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        System.out.print("BFS Traversal starting from vertex " + start + ": ");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int neighbor : adjacencyList.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Main method to demonstrate the graph operations
    public static void main(String[] args) {
        GraphDemo graph = new GraphDemo();

        // Adding vertices
        for (int i = 1; i <= 5; i++) {
            graph.addVertex(i);
        }

        // Adding edges
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        // Performing DFS and BFS
        graph.dfs(1); // Start DFS from vertex 1
        graph.bfs(1); // Start BFS from vertex 1
    }
}