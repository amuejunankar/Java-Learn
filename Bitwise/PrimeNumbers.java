public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1 ; i <= n; i++) {
            System.out.println(i+" "+isPrime(i));
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;

        }
        // as we ignore 1 in prime
        /// so start with 2
        int c = 2;
        // same as c <= sqrt(n)
        // squaring both side will get this
        while (c * c <= n) {
            if ( n % c == 0) {
                return false;
            }
            c++;
        }
        // if no number is dividable then,
        return true;
    }
}
