public class ToUpperCase {

    // word
    // Every time string is modified a new object is created
    public static String toUpperCaseWord(String str) {
        String upper = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            upper += Character.toUpperCase(ch);
        }

        return upper;
    }

    // StringBuilder is mutable
    // Modifies same string
    public static String toUpperCaseWord2(String str) {
        StringBuilder upper = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            upper.append(Character.toUpperCase(ch));
        }

        return upper.toString();
    }

    // Sentence
    public static String toUpperCaseSentence(String sen) {
        StringBuilder sb = new StringBuilder();
        char firstindex = Character.toUpperCase(sen.charAt(0));
        sb.append(firstindex);

        for (int i = 1; i < sen.length(); i++) {
            if (sen.charAt(i) == ' ' && i < sen.length() - 1) {
                sb.append(sen.charAt(i));
                i++;
                sb.append(Character.toUpperCase(sen.charAt(i)));
            } else {
                sb.append(sen.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "Sneha";
        System.out.println(str.toUpperCase());
        System.out.println(toUpperCaseWord(str));
        System.out.println(toUpperCaseWord2(str));

        String sen = "hii, this is sneha";
        System.out.println(toUpperCaseSentence(sen));

    }
}
