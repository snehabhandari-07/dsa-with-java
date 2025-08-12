import java.util.Scanner;

public class ClearRangeOfBits {

    public static int clearRange(int num, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;

        int result = num & bitMask;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter ith bit: ");
        int ithBit = sc.nextInt();

        System.out.print("Enter jth bit: ");
        int jthBit = sc.nextInt();

        int updatedValue = clearRange(num, ithBit, jthBit);
        System.out.println("Updated number: " + updatedValue);
        sc.close();
    }
}
