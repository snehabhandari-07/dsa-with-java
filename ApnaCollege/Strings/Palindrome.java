import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        } else {
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        if (checkPalindrome(str.toLowerCase()) == true) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }

        sc.close();
    }
}