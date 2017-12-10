
public class FlipMatrixHorizontal {
    // java.util.* has been imported for this problem.
// You don't need any other imports.

    /**
     * This method flips a matrix on its horizontal axis.
     *
     * <p>Time complexity: O(n^2) | Space complexity: O(1)
     *
     * @param matrix the matrix to be flipped
     */
    public static void flipHorizontalAxis(int[][] matrix) {
        int len = matrix.length;
        for (int row = 0; row < len/2; row++) {
            for (int col = 0; col < len; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[len-1-row][col];
                matrix[len-1-row][col] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][][] matrices = {
            {{0,0,1},{1,0,0}},
            {{1,0,1},{1,0,1}},
            {{7,8,9},{4,5,6},{1,2,3}},
            {{1,0}},
            {{1}}
        };
        for (int[][] matrix : matrices) {
            System.out.println("Before: ");
            printMatrix(matrix);
            flipHorizontalAxis(matrix);
            System.out.println("After: ");
            printMatrix(matrix);
            System.out.println();
        }
    }
}
