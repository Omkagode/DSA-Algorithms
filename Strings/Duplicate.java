// import java.util.*;

public class Duplicate {

    public static void RemoveDuplicate(String str) {
        StringBuilder sb = new StringBuilder("");
        boolean[] map = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            if(map[str.charAt(i)-'a' ]==false){
                sb.append(str.charAt(i));
                map[str.charAt(i)-'a']=true;

            }

            // if (!map[str.charAt(i) - 'a']) {
            //     sb.append(str.charAt(i));
            //     map[str.charAt(i) - 'a'] = true;
            // }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = "banana";
        RemoveDuplicate(str);
    }

}
