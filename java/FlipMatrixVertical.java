public class FlipMatrixVertical {

    /**
     * This method flips an mxn 2D matrix in-place along its vertical axis.
     * <p>
     * Time complexity: O(n^2) | Space complexity: O(1)
     *
     * @param matrix the matrix to flip
     */
    public static void flipVerticalAxis(int[][] matrix) {
        for (int[] row : matrix) {
            int len = row.length;
            for (int i = 0; i < len/2; i++) {
                int temp = row[i];
                row[i] = row[len-1-i];
                row[len-1-i] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][][] matrices = {
            {{1,0,0},{0,0,1}},
            {{1,0,1},{1,0,1}},
            {{1,2,3},{4,5,6},{7,8,9}},
            {{1,0}},
            {{1}}
        };
        for (int[][] matrix : matrices) {
            System.out.println("Before: "); printMatrix(matrix);
            flipVerticalAxis(matrix);
            System.out.println("After: "); printMatrix(matrix);
            System.out.println();
        }
    }
}
