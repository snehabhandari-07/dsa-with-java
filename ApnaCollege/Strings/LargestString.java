public class LargestString {

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static String largestString(String str[]) {
        String largest = str[0];

        // .compareTo - return 0 is strings are equal
        // return value greater than 0 if str1 is larger lexicographically
        // returns value less than 0 if str2 is larger
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }

        return largest;
    }

    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };
        System.out.println(largestString(fruits));

    }
}
