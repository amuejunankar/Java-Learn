public class one_to_n {
    public static void main(String[] args) {
        oneToN(5);
    }

    public static void oneToN(int n) {
        if ( n > 0) {
            oneToN(n-1);
            System.out.println(n);
        }
    }
}

// print 1 to n . 
// Ex > 1 2 3 4 5
