import java.util.Scanner;

public class PlusSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (odd): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("n must be odd.");
            scanner.close();
            return;
        }

        // Integer division lands on the center index for odd n
        int mid = n / 2;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // Star on the middle row or the middle column
                System.out.print(row == mid || col == mid ? "*" : " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
