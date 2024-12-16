// import java.util.*;

public class CountSort {
    
    public static void CountSorts(int []arr,int n){

        int largest=Integer.MIN_VALUE;

        for(int i=0; i<n;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]= new int [largest+1];

        for(int i=0; i<n;i++){
            count[arr[i]]++;
        }

        //sorting 

        int j=0;

        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;  // add element at the array at correct pos  
                j++; // increase the array
                count[i]--; // reducess the count form the counting  array 
                }
        }


    }

    public static void printArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
    }

    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        int n=arr.length;
       CountSorts(arr,n);
       printArr(arr);


    }
    
}
