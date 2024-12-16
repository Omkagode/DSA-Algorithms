public class RemoveFromLast {
    
    class Node{
        int data;
        Node next;

       public Node(int data){
        this.data=data;
        this.next=null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addElement(int data){
        Node newNode=new Node(data);

        if(head==null){
            head= tail=newNode;
        }
        
        tail.next= newNode;
        tail=newNode;
        size++;
      

    }

    public void DeleteNthFromEnd(int n){
        //base case:
        if(n==size){
            head=head.next;
            return;
        }
       
        Node prev=head;
        int i=0;
        int idx=size-n;
        while (i<idx-1) {
            prev=prev.next;
            i++;  
        }
        Node nextNode=prev.next.next;
        prev.next=nextNode;



    }
    public void printList(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
           
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        RemoveFromLast list=new RemoveFromLast();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);
        
        
        list.printList();
        System.out.println(size);
        // list.DeleteNthFromEnd(2);
        // list.printList();
        list.DeleteNthFromEnd(5);
        list.printList();
      
    }
    
}
