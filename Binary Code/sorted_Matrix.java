import java.util.Arrays;

// Actually Using Binary Search Here.

public class sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 7;
        System.out.println(Arrays.toString(search(arr, target)));
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
            int mid = rowStart + (rowEnd - rowStart) / 2 ;
            if (matrix[mid][colMid] == target) {
                return new int[]{mid, colMid};

            }
            if (matrix[mid][colMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        // now we have 2 Rows Remaining.
        // check wheather the target is in the col of 2 rows
        if (matrix[rowStart][colMid] == target) {
            return new int[]{rowStart, colMid};
        }
        // rowEnd going to be.
        if (matrix[rowStart+1][colMid] == target) {
            return new int[]{rowStart, colMid};
        }

        
        // search in 1st half
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols- 1]) {
            return binarySearch(matrix, rowStart, colMid+1, cols-1, target);
        }
        // search in 3rd half
        if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, colMid-1, target);
        }    
        // search in 4th half
        else {
            return binarySearch(matrix, rowStart+1, colMid+1, cols-1, target);
        }
    }
}