public class passingNumbers {
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n) {
        if ( n==0) {
            return;
        }
        System.out.print(n+" ");
        //fun(n--); // this will pass n then minus the Value
        fun(--n); // this will subtract first then pass the value
    }
}
