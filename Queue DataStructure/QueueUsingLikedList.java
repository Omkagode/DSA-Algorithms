public class QueueUsingLikedList {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue Class
    static class Queue {
        static Node head;
        static Node tail;
        // is queue empty

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // remove
        public int remove() {
            // base condition
            if (isEmpty()) {
                System.out.println("empty Queue");
                return -1;
            }

            int front = head.data;

            // single element
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }

            return front;
        }

        // peek
        public  int peek() {
            if (isEmpty()) {
                System.out.println("empty Queue");
                return -1;
            }

            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }
}