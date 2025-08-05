import java.util.*;

public class LargestInArr {

    public static int findLargest(int arr[]) {
        int max = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findSmallest(int arr[]) {
        int mini = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }

        return mini;
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

        System.out.println("Input 10 Elements in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is : ");
        printArr(arr);

        System.out.println("Largest Element in array is : " + findLargest(arr));
        System.out.println("Smallest Element in array is : " + findSmallest(arr));

        sc.close();
    }
}
