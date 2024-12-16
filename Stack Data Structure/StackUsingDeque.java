import java.util.*;
import java.util.LinkedList;

public class StackUsingDeque {

    static class Stack{
        Deque<Integer> deque= new LinkedList<>();

        public boolean isEmpty(){
            return deque.isEmpty();
        }

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            int top = deque.removeLast();
            return top;
        }

        public int peek(){
            return deque.peekLast();
        }
    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
    
}
