
public class LLMergeSort {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        
    }

    // step 1: Find Mid
    public Node getMid(Node head) { // By using Slow-fast
        Node slow = head;
        Node fast = head.next; // one change to avoid the odd-even condition
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Mid
    }

    // step 2: Splitting the list
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) { // base case
            return head;
        }
        Node mid = getMid(head); // mid point of the list
        Node leftHead = head;
        Node rightHead = mid.next;
        mid.next = null; // separating the list
        Node newLeft = mergeSort(leftHead);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight); // merging the list
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
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
        LLMergeSort ll = new LLMergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.printLL();
        ll.head=ll.mergeSort(ll.head);
        ll.printLL();
    }
}
