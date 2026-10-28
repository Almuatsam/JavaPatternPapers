import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Next odd number to print; carries over from row to row
        int nextOdd = 1;

        for (int row = 1; row <= n; row++) {
            // Row r holds r numbers
            for (int col = 0; col < row; col++) {
                System.out.print(nextOdd + " ");
                nextOdd += 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}
