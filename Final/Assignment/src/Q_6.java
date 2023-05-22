import java.util.Scanner;
// MatrixPrinter
public class Q_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row: ");
        int rows = scanner.nextInt();
        System.out.print("Columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix form:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
