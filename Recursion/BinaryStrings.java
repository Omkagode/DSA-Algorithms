public class BinaryStrings {

    public static void PrintBinaryString (int n, int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }


        //condition 

        //put 0 on n chair
        PrintBinaryString(n-1, 0, str+"0");

        if (lastPlace==0) {
            PrintBinaryString(n-1, 1, str+"1");
            
        }

    }

    public static void main(String[] args) {
        PrintBinaryString(2, 0, "");
        
    }
    
}
