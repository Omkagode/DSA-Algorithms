import java.util.*;
/*
 Time Complexity: O(n)
 Auxiliary Space: O(n)
 */
// Remoev duplicte Pinrt single element only
 class AvoidRepeation {    

  static char [] Repeation(char[] str) {

        Map<Character,Integer> temp = new HashMap<>();

        String sb = "";

        for (int i = 0; i < str.length; i++) {

            if (!temp.containsKey(str[i])) {
                sb += str[i];
                temp.put(str[i], 1);
            }
        }
        return sb.toCharArray();

    }

    public static void main(String[] args) {
        char []str = "aabbababcddcccddddefeeff" .toCharArray();
        System.out.println(Repeation(str));
    }

}
