import java.util.Scanner;

public class FullDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Upper half: 1 star growing to the widest row (2n - 1 stars)
        for (int row = 1; row <= n; row++) {
            printRow(n - row, 2 * row - 1);
        }

        // Lower half: shrinking from the row below the widest down to 1 star
        for (int row = n - 1; row >= 1; row--) {
            printRow(n - row, 2 * row - 1);
        }

        scanner.close();
    }

    public static void printRow(int spaces, int stars) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
