//Tmime compalexity :-  O(2^n);
//Space Compalexity:- O(n)


public class Subset {

    public static void findSubsets(String str, String ans, int i){

        //Base Case (i== at the last element in array)
        if(i == str.length()){
            System.out.print(ans +" ");
            return;
            }

        findSubsets(str, ans+str.charAt(i), i+1); // Charactors
        findSubsets(str, ans, i+1); // No Charactor is add 

    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
    
    
}
