import java.util.ArrayList;

public class AtListTwichOccourance {

     //Brute force Apporcha:-
    // public static boolean ContainsDuplicates(int []arr,int n){

    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){

    //             if (arr[i]==arr[j]) {
    //                 return  true;
    //             }

    //         }
    //     }
    //     return false;

    // }


    //Better Apporach :-

    public static boolean ContainsDuplicates(int []arr,int n){
        ArrayList <Integer> List= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(List.contains(arr[i])){
                return true;
            }else{
                List.add(arr[i]);
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int []arr={1,2,3,1};
        int n= arr.length;
        boolean ans= ContainsDuplicates(arr, n);
        System.out.println(ans);
    }
    
}
