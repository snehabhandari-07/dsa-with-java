import java.util.Scanner;

public class PrintNum {

    // Print numbers in increasing order
    public static void inc(int num) {
        // Base condition
        if (num == 0) {
            return;
        }
        inc(num - 1);
        System.out.print(num + " ");
    }

    // Print numbers in decreasing order
    public static void desc(int num) {
        // Base condition
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        desc(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        inc(num);
        desc(num);

        sc.close();
    }
}