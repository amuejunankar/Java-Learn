public class pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n ) {
        for (int row = 0; row < 2*n; row++) {
            int TotalColsInRow = row > n ? 2 * n - row : row;
            for(int col = 0; col < TotalColsInRow ; col++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// ? Pattern

// *
// **
// ***
// ****
// ***
// **
// *      7-4=3-1=2