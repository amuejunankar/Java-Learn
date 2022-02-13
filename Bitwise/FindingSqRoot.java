public class FindingSqRoot {
    public static void main(String[] args) {
        // This is for Non Perfect number 
        int n = 40; /// just a number 
        int p = 3;  // decimal number // P > Precision

        System.out.println(sqrt(n,p));
        // for Three Decimal Places
        System.out.printf("%.3f",sqrt(n, p));
    }

    // ! Time : O(log(n))
    public static double sqrt(int n, int p) {

        int start = 0 ;
        int end = n;
        double root = 0.0;

        while( start <= end) {
            int mid = start + (end - start) / 2 ;

            if ( mid*mid == n ) {
                return mid;
            }
            if( mid*mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < p ; i++) {
            while( root * root <= n) {
                root += increment;
            }
            // it will break after, which means our solution is back
            // example 
            // 6.3*6.3 = 39.3
            // 6.4*6.4 = 40.3 Here 6.3 is our answer  
            // so we can minus the increment dirctly getting 
            // answer 6.4 - 0.1 = 6.3

            root = root - increment;
            increment = increment / 10;
        }
        return root;
    }   
}

//  There Another Way to FIND SqR > // ? Newton Raphson Method
// ? Do Check

// just an IDEA !!!
// After getting an INT value which is mid*mid = n
// n-mid*mid = 0; which means they are perfect sq number