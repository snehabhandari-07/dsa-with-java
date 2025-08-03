public class InsertionSort {

    public static void sort(int arr[]) {
        // Start from 2nd element of array
        // Assume 1st element to be sorted
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;

            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }

            arr[previous + 1] = current;

        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Original Array : ");
        printArr(arr);
        System.out.println("After Insertion sort : ");
        sort(arr);
        printArr(arr);
    }
}
