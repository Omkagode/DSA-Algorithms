public class CheckArraySortedOrNot {

    public static Boolean Checking (int [] arr, int i){
        if (i == arr.length - 1) return true; // single element Base condition

        if(arr[i]>arr[i+1]){
            
            return false;
        }
        
        
        
        

       return Checking(arr, i+1);

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7};
        System.out.println(Checking(arr, 0));
    }
    
}
