public class DoublyLL {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }

    }

    public static Node head;
    public static Node tail;

    public void adddfirst(int data) {
        Node newNode = new Node(data);
        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // recursive case
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void adddLast(int data) {
        Node newNode = new Node(data);
        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // recursive case
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        // newNode.next = null;

    }

    public void removeFirst() {
        // base case
        if (head == null) {
            return;
        }
        // recursive case
        head = head.next;
        head.prev = null;

    }

    public void removeLast() {
        // base case
        if (head == null) {
            return;
            }
            // recursive case
            tail = tail.prev;
            tail.next = null;

    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.adddfirst(0);
        ll.adddLast(1);
        ll.adddLast(2);
        ll.adddLast(3);
        ll.adddLast(4);

        print();
        ll.adddLast(5);
        print();

    }

}
