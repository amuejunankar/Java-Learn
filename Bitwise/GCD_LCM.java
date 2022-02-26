public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
        System.out.println(LCM(9,18));
    }
    public static int gcd(int a, int b) {  // Recursion over here
        if ( a == 0) {
            return b;
        }
        return gcd(b%a,a);
    }

    static int LCM(int a, int b) {
        return a*b / gcd(a, b);
    }
}

//  Highest Common Factor
//  Ex. 4 and 8 
//  factors 4 > 1 2 4 
//  factors  8 > 1 2 4 8
//  Highest Common factor is > 4