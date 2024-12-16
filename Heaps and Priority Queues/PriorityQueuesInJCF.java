import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuesInJCF {
    public static void main(String[] args) {
    
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // To Print the in descending order (i.e in reverse order )
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        //adding  TC: O(logn)
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(10);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" "); //Peek in TC: O(1)
            pq.remove(); //remove in TC:O(logn)
            
        }
    }
    
}
