import java.util.HashSet;
// import java.util.Iterator;



public class HashSetIetrator {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Chennai");
        set.add("Bangaluru");

        //Interate using Iterator

        //  Iterator<String> it = set.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

         //Interate using for Loop
         for (String city : set) {
            System.out.println(city);
         }
    }
}
