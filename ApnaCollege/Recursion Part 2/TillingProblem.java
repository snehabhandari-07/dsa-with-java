import java.util.Scanner;

public class TillingProblem {

    // Board - 2 * n (floor size)
    public static int tillingProb(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical
        int fnm1 = tillingProb(n - 1);

        // horizontak
        int fnm2 = tillingProb(n - 2);

        // total Ways
        int total = fnm1 + fnm2;

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tillingProb(n));
        sc.close();
    }
}
