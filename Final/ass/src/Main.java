import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the matrix:");

        // Read input for the matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix:");

        // Print the matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate and print sum of each row
        System.out.println("Sum of numbers in each row:");
        for (int i = 0; i < 4; i++) {
            int sumRow = 0;
            for (int j = 0; j < 4; j++) {
                sumRow += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sumRow);
        }

        // Calculate and print sum of each column
        System.out.println("Sum of numbers in each column:");
        for (int j = 0; j < 4; j++) {
            int sumColumn = 0;
            for (int i = 0; i < 4; i++) {
                sumColumn += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sumColumn);
        }

    }
}
