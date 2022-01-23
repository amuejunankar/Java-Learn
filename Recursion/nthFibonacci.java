public class nthFibonacci {
    public static void main(String[] args) {
        // Check for 4th position Fib number
        System.out.println(fibo(4));
    }

    static int fibo(int n) {
        //  Base Condition
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}