public class MainApp {
    public static void main(String[] args) {
        // Example 1: Simple graph
        Graph graph1 = new Graph(4);
        graph1.addEdge(0, 1);
        graph1.addEdge(0, 2);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 0);
        graph1.addEdge(2, 3);
        graph1.addEdge(3, 3);
        System.out.println("Example 1:");
        graph1.depthFirstSearch(2); // Expected output: 2 0 1 3

        // Example 2: Disconnected graph
        Graph graph2 = new Graph(6);
        graph2.addEdge(0, 1);
        graph2.addEdge(0, 2);
        graph2.addEdge(3, 4);
        System.out.println("\nExample 2:");
        graph2.depthFirstSearch(0); // Expected output: 0 1 2
        graph2.depthFirstSearch(3); // Expected output: 3 4

        // Example 3: Large connected graph
        Graph graph3 = new Graph(5);
        graph3.addEdge(0, 1);
        graph3.addEdge(0, 4);
        graph3.addEdge(1, 2);
        graph3.addEdge(1, 3);
        graph3.addEdge(1, 4);
        graph3.addEdge(2, 3);
        graph3.addEdge(3, 4);
        System.out.println("\nExample 3:");
        graph3.depthFirstSearch(0); // Expected output: 0 1 2 3 4
    }
}
