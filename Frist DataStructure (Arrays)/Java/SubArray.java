class SubArray {

    public static void PrintSubArray(int arr[], int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            // int start=i;

            for (int j = i; j < n; j++) {
                int start = i;
                int end = j;
                System.out.print("Subarray: ");

                int sum=0;

                for (int k = start; k <= end; k++) {
                    System.out.print(+arr[k] + " ");
                    
                    // for (int m = start; m <=k; m++) {
                    //     sum += arr[m];
                    // }
                    sum +=arr[k];
                    // System.out.println("Sum :" + sum);

                }
                 
                System.out.println(  "=>"+"  Sum :" + sum);
                count++;
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("Total Count is :" + count);

    }

    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,10 };
        int n = arr.length;
        PrintSubArray(arr, n);

    }
}