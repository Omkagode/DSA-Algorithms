public class ZigZagLL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        // step1: create new node
        Node newNode = new Node(data);
       
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2: change the next of tail ko null se newNode karwana
        tail.next = newNode;
        // step3: change the tail to new node
        tail = newNode; // linking step

    }

    public void zigZag() {
        // 1. Find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // 2. Reverse the second half
        Node prev = null;
        Node curr = mid.next;
        mid.next=null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left=head;
        Node right=prev;
        Node nextL, nextR;

        //ZIg-zag merge
        while(left!=null && right!=null){
            nextL=left.next;
           left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;

        }


    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);


        ll.printLL();
        ll.zigZag();
        ll.printLL();
     
    }
}
