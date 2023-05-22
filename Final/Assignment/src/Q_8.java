// MatrixSum
public class Q_8 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int[] rowSums = new int[4];
        int[] columnSums = new int[4];
        // Calculate row sums
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                rowSums[i] += matrix[i][j];
            }
        }
        // Calculate column sums
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                columnSums[j] += matrix[i][j];
            }
        }
        // Print row sums
        System.out.println("Row sums:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }
        // Print column sums
        System.out.println("\nColumn sums:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Column " + (j + 1) + ": " + columnSums[j]);
        }
    }
}
