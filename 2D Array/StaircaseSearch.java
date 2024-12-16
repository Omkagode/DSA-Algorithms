public class StaircaseSearch {

    public static  boolean TwoDArrayKeySearch(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found at " + row + " " + col);
                return true;
                
            } else if (matrix[row][col] > key) {
                col--;
            } else {
                row++;
            }

        }

        System.out.println("Key Not Found ");

        return false;

        

    }

    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 3950 } };
        
        int key =0;        

        TwoDArrayKeySearch(matrix, key);
    }

}
