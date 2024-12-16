public class RemoveCycle {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

   

    public static boolean isCycle() {  //floyd's cycle finding
        Node slow = head;
        Node fast = head;
       
        while (slow!= null && fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
          
            if (slow == fast) {
                return true;
            }
        }
      
        return false;
    }

    // step 1: Detect the cycle
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle=false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle=true;
                break;
            }
        }

        //check the cycle is exit -not return  
        if(cycle==false){
            return;
        }

        //Step 2 :- Reach to meeting point of sloe-fast
        slow = head;
        Node prev=null;   // to track the prev of the last joining element 
        while (slow != fast) {
            slow = slow.next;
            prev=fast;
            fast = fast.next;
        }
      
        // Remove the cycle by  declear the null to the last Node 
        prev.next=null;

    }

    public static void printList(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
           
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp= new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next= temp;
        //1->2->3
       
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        printList();

        
       
    }

}
