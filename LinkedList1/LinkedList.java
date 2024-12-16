
public class LinkedList {
    public class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step1: create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2: change the next of new node to head
        newNode.next = head;
        // step3: change the head to new node
        head = newNode; // linking step

        // while (newNode != null) {
        // System.out.print(newNode.data + "->");
        // newNode = newNode.next;
        // }
        // System.out.println("null");
    }

    public void addMiddle(int idx , int data){
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1 ; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void addLast(int data) {
        // step1: create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2: change the next of tail ko null se newNode karwana
        tail.next = newNode;
        // step3: change the tail to new node
        tail = newNode; // linking step

    }

    public void print() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

        System.out.println();
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        // ll.print();
        ll.addFirst(3);
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();

        ll.addLast(4);
        // ll.print();
        ll.addLast(5);

        ll.print(); 

        ll.addMiddle(3, 10);

        ll.print(); 

        System.out.println(size);

    }

}
