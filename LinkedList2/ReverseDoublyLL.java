public class ReverseDoublyLL {

    //Node class
    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;


    //add Node's
    public void addElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head =tail= newNode;
        }

       tail.next=newNode;
       newNode.prev=tail;
       tail=newNode;

    }


    //Reverse the LinkedList
    public void reverseDoublyLL() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head=prev;
    }


    //Print LinkedList
    public void print (){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseDoublyLL list = new ReverseDoublyLL();
        list.addElement(0);
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.print();
        list.reverseDoublyLL();
        list.print();


    }

}
