import java.util.LinkedList;

 class LLJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        //add in LInked-List
        // ll.add(3);
        // ll.add(2);
        // ll.add(1);

        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        System.out.println(ll);

        ll.addLast(4);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        ll.add(2, 10);
        System.out.println(ll);
    }
    
}
