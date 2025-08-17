public class FirstOcc {

    public static int firstOcc(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOcc(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 2, 3, 4, 5, 6, 7, 8, 5 };
        System.out.println(firstOcc(arr, 0, 8));
    }
}
