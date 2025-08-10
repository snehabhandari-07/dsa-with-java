import java.util.Scanner;

public class ToggleBit {

    public static int toggle(int num, int i) {
        int bitMask = (1 << i);
        int val = num ^ bitMask;
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Ith bit to toggle");
        int i = sc.nextInt();
        System.out.println(toggle(num, i));

        sc.close();
    }
}
