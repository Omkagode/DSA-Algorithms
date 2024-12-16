//Pronlem statement is to print the Pair from thr Array And Total No of Pairs
class Pairs {

    public static void Pair(int arr[], int n) {
        int count=0;
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
        System.out.print("("+arr[i]+","+arr[j]+")" +" ");
        count++;
        }
        System.out.println( );
        }
        System.out.println("Total no. of Pairs From are :"+ count);

        // int i = 0;
        // int j = 1;
        // while (i < n) {

        //     if (j < n) {
        //         System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
        //         j++;
        //     }else{
        //         i++;
        //         j=i+1;
        //     }

        // }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int n = arr.length;
        Pair(arr, n);

    }
}