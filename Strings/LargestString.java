
  // Here we are actually not counting the Laregerst string 
  //we are sloving the LexioGraphic question like aplhabatically which starting latter is come first the s
  //according to that arrange the small to largest 
public class LargestString {

    public static String PrintLargestString(String[] fruits) {
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        String [] fruits={"apple","mango","banana"};
        System.out.println("Largest String is: "+PrintLargestString(fruits));

    }
    
}
