import java.util.ArrayList;
import java.util.Queue;

public class AllPathsFromSrcToDest {

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
       
        graph [0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void printALlPaths(ArrayList<Edge>[] graph, int scr,int dest, String path){
        if(scr==dest) {
            System.out.print(path+dest);
            return ;
        }

        for(int i=0;i<graph[scr].size();i++){
            Edge e = graph[scr].get(i);
            printALlPaths(graph, e.dest, dest, path+scr);
        }
        System.out.println();
    }

    

  
   
    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        int src=5 , dest=1;
        printALlPaths(graph, src, dest, "");

    }
    
}
