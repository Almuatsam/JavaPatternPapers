import java.util.Scanner;

public class ReverseNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int num = 1; num <= n - row + 1; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
