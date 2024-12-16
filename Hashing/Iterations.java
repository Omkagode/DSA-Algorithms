import java.util.HashMap;
import java.util.Set;

public class Iterations {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();

        //Insert O(1):
        hm.put("India", 1111);
        hm.put("Nepal", 200);
        hm.put("Us", 500);
        hm.put("Dubai", 150);
        hm.put("Newyork", 1000);

        Set<String> keys= hm.keySet();
        System.out.println(hm);

        for (String k : keys) {
            System.out.println("key= "+k+", value= "+hm.get(k));
        }
    }
    
}
