import java.util.Stack;

public class MaxAreaInHistogram {

    public static void maxArea(int[] height) {
        int maxArea = 0;
        int[] nsr = new int[height.length];// Next Smaller Right store
        int[] nsl = new int[height.length]; // Next Smaller Left store
        // Create Stack
        Stack<Integer> s = new Stack<>();

        // Next Smaller Right
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) { // smlle element
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller left
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) { // smlle element
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // MaxArea of Rectangle : Height * width
        //                        height[i]* (nsr[i]-nsl[i])
        
        for(int i=0; i<height.length;i++){

            int Height= height[i];
            int Width= nsr[i]-nsl[i]-1; 
            int Area = Height*Width;
            maxArea = Math.max(maxArea, Area);
        }

        System.out.println(" Maximum Rectangle is = "+ maxArea);

    }

    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        maxArea(height);
    }

}
