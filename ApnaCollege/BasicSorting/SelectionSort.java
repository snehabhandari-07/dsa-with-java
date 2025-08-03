public class SelectionSort {

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[mini] > arr[j]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 1, 4, 2 };
        System.out.println("Original Array : ");
        printArr(arr);
        System.out.println("After Selection sort : ");
        sort(arr);
        printArr(arr);
    }
}
