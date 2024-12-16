public class StringCompression {

    public static String Compression(String str){
        //initallization
        String compressed = "";

        //run loop to find chars.
        for(int i=0;i<str.length();i++){
            Integer count=1;

            //condition

            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            // compressed+=str.charAt(i)+count.toString(); //a2b1c5a3in this i am not like to add 1 
            compressed+=str.charAt(i);  // char add to compressed str 
           if(count>1){
            compressed+=count.toString(); // count add to compressed str
           }
            


        }

        return compressed;
    }

    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(Compression(str));
    }
    
}
