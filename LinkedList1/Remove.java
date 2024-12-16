
public class Remove {
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

    // Remove Nth Position Node
    public void removeElement(int idx){
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
            }
            Node nextNode=temp.next.next;
            temp.next=nextNode;
            size--;
            

    }

    public void removeElementformLast(int n){

        if(n==size){
            head=head.next;
            return;
        }
        Node temp=head;
        int i=0;
        int idx=(size -n);
        // System.out.println(idx);
        while(i<idx-1){
            temp=temp.next;
            i++;
            }
            
            Node nextNode=temp.next.next;
            temp.next=nextNode;
            

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
        Remove list=new Remove();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);
        
        // list.printList();
        // System.out.println(size);
        // list.removeElement(4);
         
        list.printList();
        System.out.println(size);

        
        list.removeElementformLast(5);
        list.printList();


    }

    
}
