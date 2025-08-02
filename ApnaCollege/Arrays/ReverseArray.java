import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

        System.out.println("Input 10 Elements in Way: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array is : ");
        printArr(arr);

        System.out.println("Reversed Array : ");
        reverse(arr);

        sc.close();

    }
}
