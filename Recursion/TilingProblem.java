public class TilingProblem {

    public static int WaysToFitTiles(int n){
        if(n == 0 || n == 1)  //Base Case
        return 1;

        int hori=WaysToFitTiles(n-1); //Horizontal way
        int vert=WaysToFitTiles(n-2);  //Vertical way

        return hori+vert;

    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(WaysToFitTiles(n));
    }
    
}
