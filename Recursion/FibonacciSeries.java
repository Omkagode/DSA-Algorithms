
/*
 Time Complexity: O(2^N)  
 Auxiliary Space: O(n)

 */

public class FibonacciSeries {

    public static int FibonacciNums(int n){
        if(n<=1)
        return n;
 
        return FibonacciNums(n-1) + FibonacciNums(n-2); 

    }

    public static void main(String[] args) {
        int n=20;
        // System.out.println(FibonacciNums(n));

        for(int i=0;i<n;i++){
            System.out.print(FibonacciNums(i)+" ");
        }
    }
    
}
