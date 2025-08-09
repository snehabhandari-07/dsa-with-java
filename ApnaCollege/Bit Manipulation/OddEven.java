import java.util.Scanner;

public class OddEven {

    public static void checkOddEven(int num) {
        if ((num & 1) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkOddEven(num);

        sc.close();
    }
}
