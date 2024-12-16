public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch='A';ch<='Z';ch++){
            // sb.append(ch); //26
            sb.append(ch+" ");
        }
        System.out.println(sb);
        System.out.println(sb.length());//includeing space it is 52😊
    }
    
}
