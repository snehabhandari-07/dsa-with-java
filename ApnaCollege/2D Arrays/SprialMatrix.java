public class SprialMatrix {

    public static void printMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSprial(int mat[][]) {
        int startRow = 0;
        int endRow = mat.length - 1;
        int startCol = 0;
        int endCol = mat[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // j is for col
            // i is for row
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(mat[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(mat[i][endCol] + " ");
            }

            // bottom
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(mat[endRow][j] + " ");
                }
            }

            // left
            if (startCol < endCol && startRow < endRow) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(mat[i][startCol] + " ");
                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printSprial(arr);
    }
}