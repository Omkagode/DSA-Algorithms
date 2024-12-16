
public class InsertionSort {

    public static void InsertionSorts(int []arr, int n){
        for(int i = 1; i < n; i++){
            int curr=arr[i];
            int prev=i-1;
            // finding out the correct pos to insert 
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            //insertion 
            arr[prev+1]=curr;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        int n = arr.length;
        InsertionSorts(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
