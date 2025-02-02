import java.util.ArrayList;
 class StackExp {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            return list.size() == 0;
        }

        // push (Add Karne top la )
        public  void push(int data) {
            list.add(data);
        }

        // pop(remove karne top cha element)

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek (Zak kar dekhana top pe kon betha hai)
        public  int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }

    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
