import javax.swing.plaf.synth.SynthPopupMenuUI;

public class n_To_1 {
    public static void main(String[] args) {
        System.out.println("N to 1");
        nto1(5);
    
    }

    public static void nto1(int n) {
        if ( n > 0 ) {
            System.out.print(n+ " ");
            n--;
            nto1(n);
        }
    }
    // CONCEPT N-- Vs --N
    public static void fun(int n) {
        if ( n==0) {
            return;
        }
        System.out.print(n+" ");
        //fun(n--); // this will pass n then minus the Value
        fun(--n); // this will subtract first then pass the value
    }
}

// Print to n  to 1 eg, 3 2 1