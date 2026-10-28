import java.util.Scanner;

public class DescendingAlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print((char) ('A' + n - 1 - col));
            }
            System.out.println();
        }

        scanner.close();
    }
}
