import java.util.ArrayList;

public class MutliDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mianList = new ArrayList<>();
        ArrayList<Integer> subList1 = new ArrayList<>();
        ArrayList<Integer> subList2 = new ArrayList<>();
        ArrayList<Integer> subList3 = new ArrayList<>();

        // table of 1
        for (int i = 1; i <= 5; i++) {
            subList1.add(i);

        }

        // table of 2
        for (int i = 2; i <= 10; i = i + 2) {
            subList2.add(i);

        }

        // tabel 3
        for (int i = 3; i <= 15; i = i + 3) {
            subList3.add(i);

        }

        mianList.add(subList1);
        mianList.add(subList2);
        mianList.add(subList3);

        // System.out.println(mianList);
        // System.out.println(subList2);
        // System.out.println(subList3);

        // print sublist to main list

        for (int i = 0; i < mianList.size(); i++) {
            // System.out.println(mianList.get(i));
            ArrayList<Integer> currList = mianList.get(i); // take one compelete sub arrayList
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();

        }

      

    }

}
