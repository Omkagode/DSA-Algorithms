import java.util.ArrayList;

public class FindiMax {

    public static void findMAx(ArrayList<Integer>list){
        // int max = list.get(0);
        int max= Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max = list.get(i);
            //     }
            max=Math.max(max,list.get(i));
        }
        System.out.println("Maximum Element is : "+ max);
    }

    public static void main(String[] args) {

         ArrayList<Integer> list= new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(4, 10);

        findMAx(list);

    }
    
}
