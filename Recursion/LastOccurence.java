public class LastOccurence {

    public static int Occurence(int []arr,int i,int key){
        if(i==arr.length){ // Base condition
            return -1;
            }
        
        int isFound= Occurence(arr, i+1, key);   
        if( isFound==-1 && arr[i]== key){  // checking the key present  or not 
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        // int []arr = {1,2,3,4,5,6,7,8,9,5,10}
        int []arr={5,5,5,5,5};
        int key = 5;
        System.out.println(Occurence(arr,0,key));
    }
    
}
