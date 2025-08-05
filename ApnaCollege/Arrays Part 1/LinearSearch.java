import java.util.*;

public class LinearSearch {

    public static int searchLinear(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
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

        System.out.println("Enter 10 array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key to be searched:");
        int key = sc.nextInt();

        System.out.print("Array elements: ");
        printArr(arr);

        int result = searchLinear(arr, key);
        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at : " + result);
        }

        sc.close();
    }
}