
public class reverseNumber {
    // Outer Variable , Declaration to whole scope of reverseNumber class
    public static int sum = 0;

    public static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n/10);
    }

    // ! Another True recursion without using outer variable
    // ! See another code / File 

    public static void main(String[] args) {
        reverse1(4521);
        System.out.println(sum);
    } 
}

// this is actually not recursion because we are
// using outside scope value
