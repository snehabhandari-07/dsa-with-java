public class Print7Count {

    public static int count(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 7 },
                { 5, 6, 7 },
                { 9, 8, 7 }
        };

        System.out.println(count(matrix));
    }
}
