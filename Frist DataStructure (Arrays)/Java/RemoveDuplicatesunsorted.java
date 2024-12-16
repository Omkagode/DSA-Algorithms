import java.util.*;

/*
 Time Complexity: O(n) + O(n) = O(n)

Reason:Iteration in array , searching hash table

Space Complexity : O(n) 
 */

public class RemoveDuplicatesunsorted {

    public static void RemoveDuplicate(int[] arr) {

        HashMap<Integer, Boolean> ans = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!ans.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                ans.put(arr[i], true);

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 5, 5, 8, 9, 9, 3, 4, 4, 4, 5, 5 };

        RemoveDuplicate(arr);
    }

}
