import java.util.Arrays;

public class InbuiltSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 4, 2 };
        System.out.println("Original Array : ");
        printArr(arr);
        System.out.println("After Inbuilt  sort : ");
        Arrays.sort(arr);
        printArr(arr);
    }
}
