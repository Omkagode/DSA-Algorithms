import java.util.ArrayList;

public class WaterContainer {
    // Brute Force -O(n^2)
    // public static void waterStore(ArrayList<Integer>Height){
    // int maxWater=0;
    // for(int i=0;i<Height.size();i++){
    // for(int j =i+1;j<Height.size();j++){

    // int ht=Math.min(Height.get(i), Height.get(j));
    // int wd=j-i;
    // int water=ht*wd;

    // if(water>maxWater){
    // maxWater=water;

    // }

    // }
    // }
    // System.out.println(" Max. Water store : "+maxWater);

    // }
     



    //Two Pointer -  O(n)
    public static void storedWatrer(ArrayList<Integer> Height) {
        int maxWater = 0;
        int left = 0;
        int right = Height.size() - 1;
        while (left < right) {
            //Calculate area 
            int ht = Math.min(Height.get(left), Height.get(right));
            int wd = right - left;
            int water = ht * wd;
            maxWater=Math.max(maxWater, water);
            System.out.println("["+Height.get(left)+","+Height.get(right)+"] --> "+water);
            // if (water > maxWater) {
            //     maxWater = water;
            // }

            //update pointer
            if (Height.get(left) < Height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(" Max. Water store : "+maxWater);

    }

    public static void main(String[] args) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        // waterStore(Height);
        storedWatrer(Height);

    }

}
