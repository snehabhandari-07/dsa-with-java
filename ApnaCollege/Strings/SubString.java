public class SubString {

    public static void subString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }

    // if starting and ending index is given
    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i <= ei; i++) {
            subStr += str.charAt(i);
        }

        return subStr;
    }

    public static void main(String args[]) {
        String str = "HelloWorld";

        // for loop
        subString(str);

        // starting index and ending index
        subString(str, 2, 5);

    }
}
