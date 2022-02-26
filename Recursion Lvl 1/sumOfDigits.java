import java.net.PortUnreachableException;

public class sumOfDigits {
    public static void main(String[] args) {
        int ans = summationOfDigits(1534);
        System.out.println(ans);
    }
    public static int summationOfDigits(int n) {
        if (n > 0) { 
            return (n%10) + summationOfDigits(n/10); 
        }
        return 0;
    }
}

// ? IDEA
// sum of digits 1534 > 1+5+3+4
//                    = 13
// 4 + f(153)
//        3  + f(15)
//              5 + f(1)
