// import java.util.*;

class PrefixSumofSubarray{

    public static void PrefixSumofSubarr(int []arr,int n){
        //define the Max Sum as _infinity
        int maxSum=Integer.MIN_VALUE;
        int miniSum=Integer.MAX_VALUE;

        //create the Prefix Sum Array to store the Sums
        int [] prefix= new int[n];


        //calculate the prefix sum 
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){

        // (curr indx) (prv indx)  (curr arr indx)
           prefix[i]=prefix[i-1]+arr[i];      
        }


        //finding maxSum 

        for(int start=0;start<n;start++){
            for(int end=start;end<n;end++){
                int currSum=0;
                

                currSum = start==0? prefix[end]: prefix[end]-prefix[start-1];

                if(currSum >maxSum){
                    maxSum= currSum;
                }

                if(currSum < miniSum){
                    miniSum= currSum; 
                }
            }
        }
        System.out.println("MaxSub Array Sum : "+ maxSum);
        System.out.println("MiniSub Array Sum : "+ miniSum);

    }

    public static void main(String[] args) {
        int []arr={1 ,-2,6,-1,3};
        int n= arr.length;
        PrefixSumofSubarr(arr, n);
    } 
}