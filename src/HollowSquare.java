import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                boolean isEdge = row == 0 || row == n - 1 || col == 0 || col == n - 1;
                System.out.print(isEdge ? "*" : " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
