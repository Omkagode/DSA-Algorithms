
//time complexity of O(n^2)  space complexity of O(1)

public class SelectionSort {

    public static void SelectionSorts(int []arr,int n){
        for(int i=0;i<n-1;i++){
             int min=i;
            
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
       
            //Descending order sorting 
            //int max=i;
            // for(int j=i+1;j<n;j++){
            //     if(arr[max]<arr[j]){
            //         max=j;
            //     }
            // }

            // swapping 
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }



    }

    public static void main(String[] args) {
        int []arr={5,4,1,3,2};
        int n=arr.length;
        SelectionSorts(arr,n);
        
    }
    
}
