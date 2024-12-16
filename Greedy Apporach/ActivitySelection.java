import java.util.ArrayList;



public class ActivitySelection {

    /*
     * Time Complexity: O(n) (linear time complexity)
     * Space Complexity: O(1) (constant space usage)
     */
    // public static int maxActivitiesSelection(int[] start, int[] end) {
    //     int maxActivties = 1;
    //     int lastActEnd = 0;
    //     System.out.print("A"+lastActEnd+" ");
    //     for (int i = 1; i < start.length; i++) {
    //         if (start[i] >= end[lastActEnd]) {
    //            System.out.print("A"+i+" ");
    //             maxActivties++;
    //             lastActEnd++;
    //         }
    //     }
    //     System.out.println();

    //     return maxActivties;
    // }





    /*
     Time Complexity (TC): O(n)
     Space Complexity (SC): O(n)
     */
    public static int maxActivitiesSelection(int[] start, int[] end) {
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(0);
        //1st activity
        int maxActivties = 1;
        int lastend= end[0];
        
        
       
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastend) {
                maxActivties++;
                ans.add(i);
                lastend = end[i];
            }
        }

        System.out.print("Max. No. of activities :");
        for(int i=0;i<ans.size();i++){
            System.out.print(" A"+ans.get(i)+" ");
        }
        System.out.println();
       

        return maxActivties;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        
        System.out.println("The max. No. of Activities are : "+maxActivitiesSelection(start, end));
    }

}
