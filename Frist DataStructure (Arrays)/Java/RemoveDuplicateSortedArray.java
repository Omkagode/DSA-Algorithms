public class RemoveDuplicateSortedArray {

    // TC:O(n) SC:O(1)
    // public static void removeDuplicate(int[] arr, int n) {
    // int i = 0;
    // for (int j = 1; j < n; j++) {
    // if (arr[i] != arr[j]) {
    // i++;
    // arr[i] = arr[j];
    // }
    // }
    // System.out.println("After removing duplicate elements: ");
    // for (int k = 0; k <= i; k++) {
    // System.out.print(arr[k] + " ");
    // }

    // }



    /* Time Complexity: O(NlogN) || Auxiliary Space: O(1) */

    // Function to remove duplicate elements
    // This function returns new size of modified array.
    // Using Binary Search to solve the particular problem efficiently
    public static int binarySearch(int[] nums, int low, int high, int val) {
        int n = nums.length;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Check for lower limit
            if (nums[mid] <= val)
                low = mid + 1;
            // Check for higher limit
            else {
                // Move to higher limit
                res = mid;
                high = mid - 1;
            }
        }
        // Check if not found
        if (res == -1)
            return n;

        return res;
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int idx = 0; // It store indexing of unique elements.

        while (idx != n) {
            int i = binarySearch(nums, idx + 1, n - 1, nums[idx]); // It finds upper bound of element.

            if (i == n)
                return idx + 1; // Means that we are not able to find the upper bound of the element.
            idx++;
            nums[idx] = nums[i];
        }
        return idx + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

        // removeDuplicates() returns new size of array.
        int n = removeDuplicates(arr);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
