public class Palindrome {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    // public static int size;

    public void addElement(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
        // size++;

    }

    // slow- fast apporach
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next;// +2
        }
        return slow; // slow is my mid

    }

    public static boolean isPalindrome() {
        // base condition
        if (head == null || head.next == null) {
            return true;
        }

        // step 1: Find Mid
        Node midNode = findMid(head);

        // step 2: Reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // It ids rigth half's Head
        Node left = head;

        // step 3: check left =or != right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.addElement(1);
        p.addElement(2);
        p.addElement(2);
        p.addElement(1);

       if(!isPalindrome()){
        System.out.println("Given LikedList is Not Palaindrome !");
       }else{
        System.out.println("Given LikedList is Palaindrome !");
       }
    }
}
