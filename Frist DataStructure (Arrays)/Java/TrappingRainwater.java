public class TrappingRainwater {

    public static int trappingRainwater(int []height,int n){
        //calculate the leftmax  boundary -array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

         //calculate the Rightmax  boundary -array
         int rightmax[]=new int[n];
         rightmax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);

         }

         //loop
         int trappwater=0;

         for(int i=0;i<n;i++){
            // trappwater+=Math.min(leftmax[i],rightmax[i])-height[i];
            

           //calculated water lavel
            int waterLevel=Math.min(leftmax[i], rightmax[i]);

            //formula of calculating the trappingWater
            // Trappwater = waterlevel - height[i]
            
            trappwater += waterLevel - height[i];
         }

       return trappwater;

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int n=height.length;
        System.out.println(trappingRainwater(height,n));
    }
    
}
