import java.rmi.dgc.Lease;
import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {3,4,-2,8,2,1};

        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsort(int[] arr) {
        for ( int i = 0 ; i < arr.length-1; i++) {
            for(int j = i+1; j>0;j--) {
                if ( arr[j] < arr[j-1]) {
                    swap(arr, j , j-1 );
                } else {
                    break;
                }
            }
        }
    }

    // For swapping
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// o(n) complexity best.
// o(n2) complexity worst.