import java.util.HashMap;
// import java.util.Set;

//Tc:-O(n)
public class MajorityElement {

    public static void majorityElements(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // if (map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     map.put(arr[i], 1);
            // }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        // Set<Integer> keySet = map.keySet();
        // for (Integer key : keySet) {
        // if (map.get(key) > n / 3) {
        // System.out.println(key);
        // }

        for (Integer key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.print(key+" ");
            }

        }
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        int [] arr={1,2};
        int n = arr.length;
        majorityElements(arr, n);
    }

}
