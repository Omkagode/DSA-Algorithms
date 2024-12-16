import java.util.*;

public class ReverseStack {

    // Tc:O(n) SC:O(n)
    // public static void reverseStack(Stack<Integer> s) {
    // Stack<Integer> temp = new Stack<Integer>();
    // // while (!s.isEmpty()) {
    // // temp.push(s.pop());
    // // }
    // // while (!temp.isEmpty()) {
    // // s.push(temp.pop());
    // // }

    // while (!s.isEmpty()) {
    // temp.push(s.pop());
    // }

    // // System.out.println(temp);
    // while (!temp.isEmpty()) {
    // System.out.println(temp.peek());
    // temp.pop();

    // }
    // }

    // Tc:O(n) SC:O(n)
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty())
            return;

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void pintStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println("|  " + s.peek() + "  |");
            s.pop();
        }
        System.out.println("|_____|");
        
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        // pintStack(s);

        reverseStack(s);
        pintStack(s);
    }

}
