// // import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.TreeSet;
import java.util.*;


public class LinkedHashSetExaple {
    public static void main(String[] args) {
        // Create a HashSet :- UnOrdered
        // HashSet<String> cites = new HashSet<>();
        TreeSet<String> cites= new TreeSet<>();
        cites.add("Delhi");
        cites.add("Mumbai");
        cites.add("Chennai");
        cites.add("Bangaluru");

        System.out.println(cites);

        //create a LinkedHashSet :- Oredered 
        LinkedHashSet<String> lhs= new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Chennai");
        lhs.add("Bangaluru");

        System.out.println(lhs);
    }
}
