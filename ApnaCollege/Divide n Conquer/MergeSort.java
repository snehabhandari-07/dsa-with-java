public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2;
        sort(arr, si, mid); // left part
        sort(arr, mid + 1, ei); // right part

        merge(arr, mid, si, ei);
    }

    public static void merge(int arr[], int mid, int si, int ei) {
        int temp[] = new int[ei - si + 1];
        // iterators
        int i = si; // left part iterator
        int j = mid + 1; // right part iterator
        int k = 0; // temp iterator

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original Array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}