public class oddORnot {
    public static void main(String[] args) {

        // ? Cheking if n is > Odd or Even

        int n=67;
        System.out.println(isOdd(n));

    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
        // if we add 1 with any number >
        // if it's ans is 1 then odd else even
    }
}
