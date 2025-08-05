import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void checkAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        } else {
            char[] charArray = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray, charArray2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String str2 = sc.nextLine();

        checkAnagram(str1, str2);
        sc.close();
    }
}
