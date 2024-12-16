import java.util.ArrayList;

public class PairSum {

    public static void pairSum(ArrayList<Integer> list, int trg) {

        // Brute force - O(n^2)
        // for (int i = 0; i < list.size() ; i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // if (list.get(i) + list.get(j) == trg) {
        // System.out.println("Element are"+list.get(i) + " " + list.get(j));
        // }
        // }
        // }

        // // Two Pointer :- O(n)   Way 1
        // int left = 0;
        // int right = 1;
        // while (right < list.size()) {
        //     int sum = list.get(left) + list.get(right);
        //     if (sum == trg) {
        //         System.out.println("Element are " + list.get(left) + " " + list.get(right));
        //         return;
        //     } else if (sum < trg) {
        //         right++;
        //     } else {
        //         left++;
        //     }
        // }



        //2 Pointer way two
        int left=0;
        int right=list.size()-1;

        while(left<right){
            int sum= list.get(left)+list.get(right);
            if(sum==trg){
                System.out.println("Element are "+list.get(left)+" "+list.get(right));
                
                }else if(sum<=trg){
                    left++;
                }else{
                    right--;
                }

        }
        

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       
        list.add(1); 
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        pairSum(list, 5);

    }

}
