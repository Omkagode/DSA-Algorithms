public class RemoveDuplicates {


    public static String Duplicates( String str){
        String newStr = "";

        //run loop to find chars.
        for(int i=0;i<str.length();i++){
            Integer count=1;

            //condition

            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            
            newStr+=str.charAt(i);  // char add to compressed str 
  
        }

        return newStr;
    }

    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(Duplicates(str));
    }
    
}
