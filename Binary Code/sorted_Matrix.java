// Actually Using Binary Search Here.

public class sorted_Matrix {
    public static void main(String[] args) {
        
    }

    // search in the row provided Betwn columns proviided.

    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while(colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            // where mid is indicating column Postn.
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid -1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // Caution : Matrix maybe empty

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rowStart < (rowEnd - 1)){ // while this is true, it'll have more than 2 rows

        }
    }
}
