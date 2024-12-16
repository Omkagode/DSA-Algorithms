
public class BinarySearch {

 public static int binarySearch(int arr[], int n,int k){
    int start=0;
    int end=n;
    while (start<=end) {
        int mid= (start+end)/2;
        if(k==arr[mid]){
            return mid;
        }if (mid<k) {
            start=mid+1;
        } else {
            end=mid-1;
        }

        start++;
        end--;

        
    }
    return -1;
 }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int n=arr.length;
    int k=20;
    int ans = binarySearch(arr,n,k);
    if(ans==-1)
    System.out.println("Element is not found");
    else
    System.out.println("Element present at index :"+ ans );
  }
    
}