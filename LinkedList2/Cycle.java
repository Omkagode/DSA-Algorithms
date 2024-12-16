class Cycle {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
     
    public static int c=0;
    public static boolean isCycle() {  //floyd's cycle finding
        Node slow = head;
        Node fast = head;
       
        while (slow!= null && fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
            c++;
            if (slow == fast) {
                return true;
            }
        }
      
        return false;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        //1->2->3

        System.out.println(isCycle());
        System.out.println("Size of  LinkedList : "+c);
    }
}



