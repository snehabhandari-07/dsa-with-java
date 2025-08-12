import java.util.Scanner;

public class UpdateBit {
    public static int clearBit(int num, int i) {
        int bitMask = ~(1 << i);
        int val = num & bitMask;

        return val;
    }

    public static int setBit(int num, int i) {
        int bitMask = (1 << i);
        int val = num | bitMask;

        return val;
    }

    public static int update(int val, int i, int newBit) {
        if (newBit == 0) {
            return clearBit(val, i);
        } else {
            return setBit(val, i);
        }
    }

    public static int update2(int val, int i, int newBit) {
        val = clearBit(val, i);
        int bitMask = newBit << i;
        return val | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int val = sc.nextInt();

        System.out.print("Enter bit position to update: ");
        int ithBit = sc.nextInt();

        System.out.print("Enter new bit value (0 or 1): ");
        int newBit = sc.nextInt();

        int updatedValue = update(val, ithBit, newBit);
        System.out.println("Updated number: " + updatedValue);
        System.out.println("Updated number by 2nd func : " + update2(updatedValue, ithBit, newBit));

        sc.close();
    }
}