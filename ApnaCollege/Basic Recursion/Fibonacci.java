import java.util.Scanner;

public class Fibonacci {

    public static int calculateFib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        return calculateFib(num - 1) + calculateFib(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Calculate fib till given n number
        for (int i = 0; i < num; i++) {
            System.out.print(calculateFib(i) + " ");
        }
        // System.out.println(calculateFib(num));
        sc.close();
    }
}
