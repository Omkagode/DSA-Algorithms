
public class SortAndRotated {
    public static int Search(int[] arr, int tar, int si, int ei) {
        if (si > ei) {
            return -1;
            }
        int mid = si + (ei - si) / 2;

        // base case found
        if (arr[mid] == tar) {
            return mid;
        }

        // Kaam
        // Mid on L1
        if (arr[si] <= arr[mid]) {
            // case a: left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return Search(arr, tar, si, mid - 1);
            }
            // case b: right
            else {
                return Search(arr, tar, mid + 1, ei);
            }

            // Mid on L2
        } else {
            // case a: right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return Search(arr, tar, mid + 1, ei);
            } else {
                return Search(arr, tar, si, mid - 1);
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int tar = 6;
        int si = 0;
        int ei = arr.length - 1;
        System.out.println(Search(arr, tar, si, ei));

       
    }

}