// import java.util.*;

public class MaxSumSubArray {


    //Calculate the Maxsum of sub-Array
    public static int MaxSumOfSubArray(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = 0;
                for (int m = i; m <= j; m++) {
                    currSum += arr[m];
                }
                System.out.println("Current Sum of Sub Array :" + currSum);
                System.out.println();

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("MaxSubArray Sum is :" + maxSum);
        System.out.println("--------------------------------------------------------------");
        return maxSum;
    }



    //print the minSum And MaxSum Sub-Array
    public static void MaxSumOfSubArrayPrint(int arr[], int n, int maxSum, int miniSum) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = 0;
                for (int m = i; m <= j; m++) {
                    currSum += arr[m];
                    // System.out.println(currSum);
                }

                if (currSum == maxSum) {
                    System.out.print("MaxSum SubArray is :=>");
                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m] + " ");
                    }
                }

                if (currSum == miniSum) {
                    System.out.print("MiniSum SubArray is :=>");
                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m] + " ");
                    }
                }
                // System.out.println("Current Sum of Sub Array :"+currSum);
                
                System.out.println();

            }
        }

    }


    //Calculate the Minisum of sub-Array
    static int MiniSumOfSubArray(int arr[], int n) {
        int miniSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = 0;
                for (int m = i; m <= j; m++) {
                    currSum += arr[m];
                }
                // System.out.println("Current Sum of Sub Array :" + currSum);
                // System.out.println();

                if (miniSum > currSum) {
                    miniSum = currSum;
                }
            }
        }

        System.out.println("MiniSum SubArray Sum is :" + miniSum);
        System.out.println("--------------------------------------------------------------");
        return miniSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1,-2,6,-1,3 };
        int n = arr.length;
        // int maxSum=6;
        int maxSum = MaxSumOfSubArray(arr, n);
        int miniSum = MiniSumOfSubArray(arr, n);
        MaxSumOfSubArrayPrint(arr, n, maxSum, miniSum);
    }
}
