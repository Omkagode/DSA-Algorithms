import java.util.HashMap;

public class Oprations {

    
    public static void main(String[] args) {
        // Create a HashMap
       HashMap<String, Integer> hm= new HashMap<>();

        //Insert O(1):
        hm.put("One", 1);
        hm.put("Two", 2);
        hm.put("Three", 3);
        hm.put("Four", 4);
        hm.put("Five", 5);

        //Get O(1):
        // System.out.println(hm.get("One"));

        // System.out.println(hm);

        // ContainKey(Key) O(n):

        // System.out.println(hm.containsKey("One")); // true
        // System.out.println(hm.containsKey("Six")); // false

        // remove (key) O(1):

        System.out.println(hm.remove("Three"));

        System.out.println(hm);

        System.out.println(hm.size());

        hm.clear();
        System.out.println(hm.isEmpty());
        


    }
    
}
