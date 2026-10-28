import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Upper half: widest row first, two fewer stars each row
        for (int row = 0; row < n; row++) {
            printRow(row, 2 * (n - row) - 1);
        }

        // Lower half: starts after the single-star row, two more stars each row
        for (int row = n - 2; row >= 0; row--) {
            printRow(row, 2 * (n - row) - 1);
        }

        scanner.close();
    }

    private static void printRow(int spaces, int stars) {
        System.out.println(" ".repeat(spaces) + "*".repeat(stars));
    }
}
