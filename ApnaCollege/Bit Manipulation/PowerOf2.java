import java.util.Scanner;

public class PowerOf2 {

    public static boolean isPowerOf2(int num) {
        if ((num & (num - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        boolean result = isPowerOf2(num);

        if (result == true) {
            System.out.println("Number is power of 2");
        } else {
            System.out.println("Number is not power of 2");
        }

        sc.close();
    }
}
