import java.util.*;

public class BinarySearch {

    public static int searchBinary(int arr[], int key) {
        // Store index not value
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Input 10 Elements in Sorted Way: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input key to be searched: ");
        int key = sc.nextInt();

        System.out.println("Array is : ");
        printArr(arr);

        int result = searchBinary(arr, key);
        if (result == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Element Found at index : " + result);
        }

        sc.close();
    }
}
