public class FristOccurence {
    public static int Occurence(int []arr,int i,int key){
        if(i==arr.length){ // Base condition
            return -1;
            }
        
            
        if(arr[i]== key){  // checking the key present  or not 
         
            return i;
        
        }
            return Occurence(arr, i+1, key); 
        

      

    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        System.out.println(Occurence(arr,0,key));
    }
    
}
