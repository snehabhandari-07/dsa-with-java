public class LastOcc {

    public static int lastOcc(int arr[], int i, int key) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }

        int found = lastOcc(arr, i + 1, key);
        if (found != -1) {
            return found;
        }

        if (arr[i] == key) {
            return i;
        }
        return found;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 10 };
        System.out.println(lastOcc(arr, 0, 5));
    }
}
