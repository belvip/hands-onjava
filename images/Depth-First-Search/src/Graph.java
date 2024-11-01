import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    // Initialize graph with given number of vertices
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge between two nodes
    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest); // Add destination to source’s adjacency list
    }

    // Perform DFS traversal from a given starting node
    public void depthFirstSearch(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS traversal starting from node " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }

    // Utility method for DFS using recursion
    private void dfsUtil(int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");

        // Recur for all adjacent vertices not yet visited
        for (int adj : adjacencyList[current]) {
            if (!visited[adj]) {
                dfsUtil(adj, visited);
            }
        }
    }
}
