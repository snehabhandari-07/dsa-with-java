import java.util.Scanner;

public class EvenOdd {

    public static void naiveApproach(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void evenOddEfficient(int num) {
        // Bitwise AND
        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        naiveApproach(num);
        evenOddEfficient(num);

        sc.close();

    }
}