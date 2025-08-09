public class Basic {

    // AND - &
    // OR - |
    // XOR - ^
    // ONE'S COMPLEMENT - ~
    // BINARY LEFT SHIFT - <<
    // BINARY RIGHT SHIFT - >>

    public static void main(String[] args) {
        System.out.println((5 & 6)); // AND
        System.out.println((5 | 6));
        System.out.println((5 ^ 6));
        System.out.println((~5));
        System.out.println((5 << 2));
        // Java uses 32 bit signed integers
        // Ans = -6
        // Why
        // 5 - 00000101
        // 1s complement - 11111010
        // As MSB is changed from positive to negative
        // We take 2s complement
        // ---11111010 - 1) 1st complement - ----00000101
        // 2) Add 1 - 00000101 + 1 = 00000110
        // Value is 6 and as we have taken 2s complement of a number which has MSB 1
        // Hence final ans is -6
    }
}