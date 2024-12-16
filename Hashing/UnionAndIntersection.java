import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int [] arr2={6,3,9,2,9,4};
        
        HashSet <Integer> set = new HashSet<>();
        //finding Union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        
        System.out.println(set);
        System.out.println("The Size Of Union is = "+set.size());


        //Finding Intersection
        set.clear();
       
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                //remove because the it do not comapir again and again 
              System.out.print(arr2[i]+" ");
              
              set.remove(arr2[i]);
            }
        }
        System.out.println();
        System.out.println("Intersetion of Element is = "+count);

    }
    
}
