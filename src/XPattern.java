import java.util.Scanner;

public class XPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                boolean isDiagonal = row == col || row + col == n - 1;
                System.out.print(isDiagonal ? "*" : " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
