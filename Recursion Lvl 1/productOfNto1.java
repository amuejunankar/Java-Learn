public class productOfNto1 {
    public static void main(String[] args) {
        int ans = productNto1(5);
        System.out.println("Factorial is > "+ans);
    }
    public static int productNto1( int n ) {
        if (n <= 1) {
            return 1;
        }

        return n * productNto1(n-1);
    }
}

// factprial of number\ > 5
// 5! > 5*4*3*2*1 = 120