import java.util.*;
import java.util.LinkedList;
public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque =new LinkedList<>();
        deque.addFirst(2);
        deque.addFirst(1);
       deque.addLast(3);
        deque.addLast(4);

        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
    
}
