

public class PrintArrays {

    public static void PrintArray(int []arr, int i, int val){
        //base case
        if(i == arr.length){
            print(arr);
            return;
        }
        arr[i] = val; // add the value
        PrintArray(arr, i+1, val+1); // funt^n call
        arr[i]=arr[i]-2; // Backtracking 

            
    }
    public static void print(int[]arr){
        System.out.print("{ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
        System.out.println();
    }


    public static void main(String[] args) {
        int []arr = new int[5];
        PrintArray(arr, 0, 1);
        print(arr);
    }
    
    
    

    
    
}