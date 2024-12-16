import java.util.ArrayList;

public class TargetSum {

    public static void pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;  //beaking point (pivot)

        int n = list.size(); //length

        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = (bp + 1) ; // left pointer
        int rp = bp; //rigth pointer

        while (lp != rp) {

            int sum = list.get(lp) + list.get(rp);
            
            //case1
            if (sum == target) {
                System.out.println("Pair found: " + list.get(lp) + " " + list.get(rp));
                return;
            }
            
           // case2
            if (sum < target) {
                lp = (lp + 1) % n; 

            } else {
                //case3
                rp = (rp - 1 + n) % n;
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        pairSum2(list, 16);

    }

}
