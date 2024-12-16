  //time complexity of O(n^2)  space complexity of O(1)

public class BubbleSort {
    public static void BubbleSorts(int[] arr, int n) {
        for (int turn = 0; turn < n - 1; turn++) {
            for (int j = 0; j < n - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2};
        int n = arr.length;
        BubbleSort.BubbleSorts(arr, n);


    }

}
