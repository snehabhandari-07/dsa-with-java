import java.util.Scanner;

public class ClearIbits {

    public static int clearLastiBits(int num, int i) {
        int bitMask = (-1 << i);
        int val = num & bitMask;

        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter bits to be cleared: ");
        int ithBit = sc.nextInt();

        int updatedValue = clearLastiBits(num, ithBit);
        System.out.println("Updated number: " + updatedValue);

        sc.close();
    }
}
