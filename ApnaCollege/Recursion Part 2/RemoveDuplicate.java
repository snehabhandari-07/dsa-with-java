public class RemoveDuplicate {

    // using loop
    public static String removeDup(String str) {
        StringBuilder sb = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "appnacollege";
        System.out.println(removeDup(str));
    }
}
