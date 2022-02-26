import javax.swing.text.html.HTMLDocument.BlockElement;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(121));
    }

    public static boolean palin(int n) {
        return n == rev(n,0);
    }
    public static int rev(int n, int sum) {
        if ( n == 0) {
            return sum;
        }
        sum = sum * 10 + n %10;
        return rev(n/10, sum);
    }
}
