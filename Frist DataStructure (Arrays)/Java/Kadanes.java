
// Kadanes algorithm to find the Max Subarray sum
public class Kadanes {
  
    public static void MaxSubarraySum(int[]arr, int n){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++){
            currSum=currSum+arr[i];

            if(currSum<0){
                currSum=0;
            }

            maxSum=Math.max(currSum,maxSum);
        }
         System.out.println("Max SubArray sum is : "+maxSum );
    }
   

    public static void main(String[] args) {
        int []arr={1 ,-2,6,-1,3};
        int n= arr.length;
        MaxSubarraySum(arr, n);
      
    }
}
