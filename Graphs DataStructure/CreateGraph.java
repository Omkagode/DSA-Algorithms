

import java.util.ArrayList;

class CreateGraph {

    // Making Edge class static to be accessible within static methods
    static class Edge {
        int scr;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.scr = s;
            this.dest = d;
            this.wt = w;
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 5;  // vertex numbers

        ArrayList<Edge>[] graph = new ArrayList[v]; // Create an array of ArrayList

        // Initialize the ArrayList for each vertex
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0- vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1- vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2- vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3- vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //4- vertex
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbors
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println("Vertex 2 is connected to vertex " + e.dest + " with weight " + e.wt);
        }
    }
}
