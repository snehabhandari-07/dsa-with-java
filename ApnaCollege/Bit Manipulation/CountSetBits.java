import java.util.Scanner;

public class CountSetBits {

    public static int count(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
                num = num >> 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Number of set bit in " + num + " is " + count(num));

        sc.close();
    }
}
