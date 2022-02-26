public class countZeroes {
    public static void main(String[] args) {
        int ans = countZero(102030);
        System.out.println(ans);
    }
    public static int countZero(int n) {
        if ( n == 0) {
            return 0;
        }
        if (n % 10 == 0) {
            return 1 + countZero(n/10);
        }
        return countZero(n/10);
    }
}
