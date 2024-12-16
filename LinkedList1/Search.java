public class Search {
    public class Node{
        int data;
        Node next;
       public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
    //add Elemnt to the LikedList 
    public void add(int data){
        //create newNode
        Node newNode= new Node(data);
        //if the list is empty
        //base Condition

        if(head==null){
            head=tail=newNode;

        }else{
            tail.next=newNode;
            tail=newNode;
        }
 
    }

    public void PrintList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }


     //find element 
    public static void findElement(int target){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==target ){
                System.out.println("Element Found at "+ i);
                return;
            }else{
               temp= temp.next;
               i++;
            }
        }
    }

    // find Element by recursion
     public static int  helper(Node head, int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;

        }

        int idx=helper(head.next, key);
        if(idx== -1){
           return -1;
        }
        return idx+1;
     }
    public static int recSerach(int key){
        return helper(head,key);
    }

    public static void main(String[] args) {
        Search list = new Search();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.PrintList();
      
        findElement(4);
        System.out.println(recSerach(3));

        
    }

    
}
