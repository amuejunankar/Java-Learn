public class BS_Recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9,12,15};
        int target = 12;
        int s = 0;
        int e = arr.length - 1;

        // PRINTING & CALLING FUCNTION BS
        System.out.println(BS(arr, target, s, e));
    }

    // DOING BS USING RECURSION.

    static int BS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        // CHECKING MID EVERY FUNCTION PASS COZ WE NEED MID BETWEEN 
        // START AND END.
        int m = s + (e-s) / 2;

        if (arr[m] == target) {
            return m;
        }
        // IF TARGET IS ON LEFT SIDE DO THIS, IF NOT DO THAT
        if ( target < arr[m]) {
            return BS(arr, target, s, m-1);
        } else {
            return BS(arr, target, m+1, e);
        }
    }
}
