public class NewtonRaphsonSqRoot {
    public static void main(String[] args) {
        System.out.println(SQRT(40));
    }

    public static double SQRT(double n) {
        double x = n;
        double root;
        while(true) {
            root = 0.5 * ( x + (n/x));
            if(Math.abs(root - x) < 1) { // 1 is precision 0.1 - 1.0, less better
                break;
            } 
            x = root;
        }
        return root;
    }
}
