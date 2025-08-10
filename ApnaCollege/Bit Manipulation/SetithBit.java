import java.util.Scanner;

public class SetithBit {
    public static int setBit(int num, int i) {
        int bitMask = (1 << i);
        int val = num | bitMask;
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Set Ith bit");
        int i = sc.nextInt();
        System.out.println(setBit(num, i));

        sc.close();
    }
}
