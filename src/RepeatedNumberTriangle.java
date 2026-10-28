import java.util.Scanner;

public class RepeatedNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int count = 0; count < row; count++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
