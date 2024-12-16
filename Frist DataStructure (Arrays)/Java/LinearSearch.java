
public class LinearSearch {
   public static int  lineraSearch(int[]arr,int n,int k){
    

    //Comparing Condition Mapping 
    for(int i=0;i<n-1;i++){
        if(k==arr[i]){
            // System.out.println(i);
            return i;  //print index;
        }
    }
      return -1;
   }

    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5,6,7,8,9,10}; // Declear the array
       int n= arr.length; // Length of array 
       int k=5;
       int ans=lineraSearch(arr, n, k); // Ans Store in ans Variable 
       if(ans!=-1){
        System.out.println("Element Present at Index: "+ans);
       }  else{
        System.out.println("Element is not found");
       } 
    }

}