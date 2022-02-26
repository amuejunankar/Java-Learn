// public class reverse2 {
//     public static int rev2(int n) {
//         // Sometimes you might need some additinal variables in the argument
//         // in that case ,make another function
//         int digits = (int)(Math.log10(n)) + 1;
//         return helper(n, digits);
//     }

//     public static int helper(int n, int digits) {
//         if ( n % 10 == n) {
//             return n;
//         }
//         int rem = n % 10;
//         return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(rev2(5412));
//     }
// }

// By Two Inputs 

public class reverse2 {
    public static void main(String[] args) {
        int ans = rev(4124, 0);
        System.out.println(ans);
    }
    public static int rev(int num, int sum) {
        if ( num == 0) {
            return sum;
        }
        sum = sum * 10 + num % 10;
        return rev(num/10, sum);
    }
}
