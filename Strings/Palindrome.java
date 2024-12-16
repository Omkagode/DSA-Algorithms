public class Palindrome {

    public static boolean CheckPalindrome(String str) {

        // //tc=O(n)
        // String temp="";

        // for(int i=str.length()-1;i>=0;i--){
        // temp += str.charAt(i);

        // }

        // if(str.equals(temp)){
        // System.out.println("Palindrome");
        // }else{
        // System.out.println("Not a Palindrome");
        // }

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Not a Palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;

    }

    public static void main(String[] args) {
        String str = "noon";
        CheckPalindrome(str);

    }

}
