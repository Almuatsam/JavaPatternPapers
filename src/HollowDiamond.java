import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Upper half: 1 star growing to the widest row (2n - 1 wide)
        for (int row = 1; row <= n; row++) {
            printRow(n - row, 2 * row - 1);
        }

        // Lower half: shrinking from the row below the widest down to 1 star
        for (int row = n - 1; row >= 1; row--) {
            printRow(n - row, 2 * row - 1);
        }

        scanner.close();
    }

    // width = distance from the left edge star to the right edge star, inclusive
    public static void printRow(int spaces, int width) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < width; i++) {
            boolean isEdge = i == 0 || i == width - 1;
            System.out.print(isEdge ? "*" : " ");
        }
        System.out.println();
    }
}
