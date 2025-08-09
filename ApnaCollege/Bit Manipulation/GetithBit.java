import java.util.Scanner;

public class GetithBit {

    public static int ithBit(int num, int i) {
        int bitMask = (1 << i);
        int val = num & bitMask;
        if (val == 0) {
            return val;
        }
        return 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Ith bit");
        int i = sc.nextInt();
        System.out.println(ithBit(num, i));

        sc.close();
    }
}
