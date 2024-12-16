import java.util.HashSet;

public class HashSetOprations {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(7);
        set.add(7); // Duplicate value, will not be added
        set.add(4);
        set.add(1);

   

        System.out.println(set);
        System.out.println(set.size());

        if (set.contains(2)) {
              System.out.println("Yes Bro I am Here!");
        }else{
            System.out.println(" It is Not Present  In My Set Bro , Sorry ");  
        }

        set.remove(4);
        System.out.println("4 is removed from me bro"+set);

        set.clear();
        System.out.println("My Set is cleared now bro "+set);

        System.out.println("Cheching bro st is full or Empty? => "+ set.isEmpty());
    }
    
}
