import java.util.Scanner;

public class XtoPowerN {

    public static int power(int num, int x) {
        // Base case
        if (x == 0) {
            return 1;
        }

        return num * power(num, x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(power(num, x)); // num ^ x
        sc.close();
    }
}
