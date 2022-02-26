public class sumNto1 {
    public static void main(String[] args) {
        int ans = summation(5);
        System.out.print(ans);
    }

    public static int summation( int n) {
        if ( n > 0) {
            return n + summation(n-1);
        } else {
            return 0;
        }
    }
}

// 5! = 5+4+3+2+1 = 15