public class DigonalSum {
    
    //TC=O(n^2)
    // public static void PrimaryDiagonalSum(int [][] matrix){
    //     int sum = 0;
        
    //     for(int i = 0; i < matrix.length; i++){
    //             //primary diagonal
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(i==j){
    //                 sum+=matrix[i][j];

    //             }else if (i+j==matrix.length-1) {  //seconadry diagonal
    //                 sum+=matrix[i][j];
                    
    //             }

    //         }
    //     }

    //     System.out.println(sum);


    // }


    //Tc=O(n)

    public static void PrimaryDiagonalSum(int [][] matrix){
        int sum = 0;
        
        for(int i = 0; i < matrix.length; i++){
            //primary diagonal     
          sum+=matrix[i][i];


           //Secondary diagonal
          if(i!=matrix.length-1-i)
             sum+=matrix[i][matrix.length-i-1];
        
        }

        System.out.println(sum);


    }


   



    public static void main(String[] args) {
        // int[][] matrix = { { 1, 2, 3, 4 },
        //         { 5, 6, 7, 8 },
        //         { 9, 10, 11, 12 },
        //         { 13, 14, 15, 16 },
        // };

        int [][]matrix={{0,1,2},
                        {3,4,5},
                        {6,7,8}       
                               
                              };

        PrimaryDiagonalSum(matrix);
        
    }
    
}
