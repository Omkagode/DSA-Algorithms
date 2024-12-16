import java.util.ArrayList;

public class Reverse {

    public static ArrayList<Integer> reverseList(ArrayList<Integer>list){
        
        for(int i=0;i<list.size()/2;i++){
            //sawpping 
            Integer temp=list.get(i);    //int temp= arr[i] 
            list.set(i, list.get(list.size()-i-1));  //arr[i]=arr[j]
            list.set(list.size()-i-1, temp);       //arr[j]=temp

        }

        return list;
    }
    public static void printElements(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {

         ArrayList<Integer> list= new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }

        reverseList(list);
        printElements(list);
    }
    
}
