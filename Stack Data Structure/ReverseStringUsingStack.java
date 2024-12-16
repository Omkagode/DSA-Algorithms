import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        // for (int i = 0; i < str.length(); i++) {
        // stack.push(str.charAt(i));
        // }

        int idx = 0;
        while (idx < str.length()) {
            stack.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            char curr = stack.pop();
            result.append(curr);

        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans=reverseString(str);
        System.out.println(ans);
    }

}
