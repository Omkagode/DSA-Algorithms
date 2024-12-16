import java.util.*;
import java.util.LinkedList;
public class QueueUsingDeque {

    static class Queue{
        Deque<Integer> deque= new LinkedList<>();

        public boolean isEmpty(){
            return deque.isEmpty();
        }

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            int front = deque.removeFirst();
            return front;
        }

        public int peek(){
            return deque.peekFirst();
        }
    }

    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        

        while (!q.isEmpty()) {
            System.out.print(q.remove() +" ");
            
        }
    }
    
}
