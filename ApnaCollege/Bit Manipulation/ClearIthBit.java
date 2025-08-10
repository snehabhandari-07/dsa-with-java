import java.util.Scanner;

public class ClearIthBit {
    public static int clearBit(int num, int i) {
        int bitMask = ~(1 << i);
        int val = num & bitMask;

        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Clear Ith bit");
        int i = sc.nextInt();
        System.out.println(clearBit(num, i));

        sc.close();
    }
}
