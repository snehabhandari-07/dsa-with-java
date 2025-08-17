import java.util.Scanner;

public class Factorial {

    public static int fact(int num) {
        // Base Case
        if (num == 0 || num == 1) {
            return 1;
        }

        int fact = num * fact(num - 1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));

        sc.close();
    }
}
