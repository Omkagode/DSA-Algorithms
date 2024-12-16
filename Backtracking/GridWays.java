//time complexity : O(2^(n+m))  Exponational

// public class GridWays {

//     public static int  GridWay(int i, int j,int n,int m){
//         //base case
//         if(i==n-1 && j==m-1){ // condition for last cell
//             return 1;
//         }else if(i==n || j==m){ //Boundary cross condition
//             return 0;
//         }

//         int wR=GridWay(i, j+1, n, m); //going right side
//         int wL=GridWay(i+1, j, n, m);  //going down side

//         return wR+wL; // total way 
//     }

//     public static void main(String[] args) {
//         int n=3;
//         int m=3;
//         System.out.println(GridWay(0, 0, n, m));
//     }
    
// }


/***********************************************************************/

//time complexity : O(n+m)  Linear  

public class GridWays{

}