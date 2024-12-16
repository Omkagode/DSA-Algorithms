import java.util.ArrayList;

class MergeSort {

    public static void mergeSort(int[] arr, int n, int low, int heigh) {
        if (low >= heigh)
            return;

        int mid = (low + heigh) / 2;
        mergeSort(arr, n, low, mid);
        mergeSort(arr, n, mid + 1, heigh);
        merge(arr, n, low, mid, heigh);
    }

    public static void merge(int[] arr, int n, int low, int mid, int heigh) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= heigh) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {

                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;

        }

        while (right <= heigh) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= heigh; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        mergeSort(arr, n, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// class MergeSort {
// public static void mergeSort(int[] arr, int n, int si, int ei) {
// if (si >= ei)
// return;

// int mid = si + (ei - si) / 2;

// mergeSort(arr, n, si, mid);
// mergeSort(arr, n, mid + 1, ei);
// merge(arr, n, si, mid, ei);

// }

// public static void merge(int[] arr, int n, int si, int mid, int ei) {
// int[] temp = new int[ei - si + 1];
// int left = si;
// int right = mid + 1;
// int index = 0;

// while (left <= mid && right <= ei) {
// if (arr[left] <= arr[right]) {
// temp[index++] = arr[left++];
// } else {
// temp[index++] = arr[right++];
// }
// }

// while (left <= mid) {
// temp[index++] = arr[left++];
// }

// while (right <= ei) {
// temp[index++] = arr[right++];
// }

// for (int i = 0; i < temp.length; i++) {
// arr[si + i] = temp[i];
// }

// }

// public static void main(String[] args) {
// int[] arr = { 5, 3, 2, 1,4};
// int n = arr.length;
// mergeSort(arr, n, 0, n - 1);
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }

// }

// }
