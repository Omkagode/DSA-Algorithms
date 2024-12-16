public class SubString {
    public static void main(String[] args) {
        String str = "011";
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }

}
