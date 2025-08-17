import java.util.Scanner;

public class Sum {

    public static int sumOf1toN(int num) {
        int sum = 0;
        // Base case
        if (num == 1) {
            return 1;
        }

        sum = num + sumOf1toN(num - 1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOf1toN(num));

        sc.close();
    }
}
