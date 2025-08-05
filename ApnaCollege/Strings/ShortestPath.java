import java.util.Scanner;

public class ShortestPath {

    public static float getShortestPath(String path) {
        path = path.toUpperCase();
        // Initial points are (0,0) ie x1 and y1
        int x = 0, y = 0; // x2 and y2

        for (int i = 0; i < path.length(); i++) {
            char letter = path.charAt(i);

            if (letter == 'E') {
                x++;
            } else if (letter == 'W') {
                x--;
            } else if (letter == 'N') {
                y++;
            } else {
                y--;
            }

        }
        // Distance formula - square root of (x2 - x1)^2 + (y2-y1)^2
        // as initial points are 0 and 0
        // we need to calculate sqaure root of (x2)^2 + (y2)^2
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Path : ");
        String str = sc.nextLine();
        System.out.println(getShortestPath(str));
        sc.close();
    }
}
