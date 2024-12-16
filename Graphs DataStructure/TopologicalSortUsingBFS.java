import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortUsingBFS {

    static class Edge {
        int scr;
        int dest;

        public Edge(int s, int d) {
            this.scr = s;
            this.dest = d;

        }

    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void calculateIndegree(ArrayList<Edge>[] graph, int[] indegree) {

        for (int i = 0; i < graph.length; i++) {
            int vertex = i;

            for (int j = 0; j < graph[vertex].size(); j++) {
                Edge e = graph[vertex].get(j);
                indegree[e.dest]++;
            }
        }

    }

    public static void topSort(ArrayList<Edge>[] graph) {
        int[] indegree = new int[graph.length];
        calculateIndegree(graph, indegree);
        Queue<Integer> q = new LinkedList<>();
        

        // 1st setp:
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }

        }


        //bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indegree[e.dest]--;

                if(indegree[e.dest]==0){
                    q.add(e.dest);
                }
            }
           

        }
        // System.out.println();
    }

   
    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
        
        

    }

}
