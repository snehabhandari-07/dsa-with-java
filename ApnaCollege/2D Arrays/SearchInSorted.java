public class SearchInSorted {
    // StairCase Search
    // row wise and col wise sorted matrix

    // Brute force
    public static void searchLinearly(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("Found at : " + "(" + i + "," + j + ")");
                    return;
                }
            }
        }
    }

    // StairCase Search
    public static boolean stairCase(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        // starting with (0, col)

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found at : " + "(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        System.out.println(stairCase(matrix, 33));
    }
}
