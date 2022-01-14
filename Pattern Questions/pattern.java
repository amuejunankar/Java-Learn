public class pattern {
    public static void main(String[] args) {
        pattern3(5);   
    }

    static void pattern3(int n) {
        for(int row = n; row>=1;row--) {
            for(int col = row ; col>= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// ? Printing 3rd 

// * * * * *
// * * * *
// * * *
// * *
// *
