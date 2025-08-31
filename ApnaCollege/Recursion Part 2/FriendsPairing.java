public class FriendsPairing {

    public static int pairFriends(int n) {

        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single
        int fnm1 = pairFriends(n - 1);

        // pair
        int fnm2 = pairFriends(n - 2);
        int pairWays = (n - 1) * fnm2;

        // total ways
        int totalWays = fnm1 + pairWays;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(pairFriends(3));
    }
}
