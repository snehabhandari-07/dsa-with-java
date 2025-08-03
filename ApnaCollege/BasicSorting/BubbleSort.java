public class BubbleSort {

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 67 };
        System.out.println("Original Array : ");
        printArr(arr);
        System.out.println("After Bubble sort : ");
        sort(arr);
        printArr(arr);
    }
}