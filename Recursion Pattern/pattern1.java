import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        System.out.println("Recursion Problem");
        printing(4,0);
    }

    public static void printing(int row, int col) {
        if(row == 0) {
            return;
        }
        if (col < row ) {
            System.out.print("* ");
            printing(row, col+1);
        } else {
            System.out.println();
            printing(row-1, 0);
        }
    }
}