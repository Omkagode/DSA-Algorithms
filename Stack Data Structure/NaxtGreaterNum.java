import java.util.Stack;

public class NaxtGreaterNum {
    public static void main(String[] args) {
        int [] arr={6,8,1,0,5};
        Stack <Integer> s= new Stack<>();
        int [] nextGreater = new int[arr.length];

        //1 while loop
        for(int i=arr.length-1; i>=0l;i--){
            // checkinh the top  element if less than current element
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreater[i]= -1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }

            s.push(i);

        }


        // for(int i=0;i<nextGreater.length;i++){
        //     System.out.println("Next Greater Element for "+arr[i]+" is "+nextGreater[i]);
        // }

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
    
}

