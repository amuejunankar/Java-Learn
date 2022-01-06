import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3,4,-2,8,2,1};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for(int i = 0; i< arr.length;i++) {
            swapped = false;
            // for each step, max item will come at last index Respective index
            for (int j=1; j < arr.length - i; j++ ) {
                // Swap, if the current item is smaller than the previous item
                if( arr[j] < arr[j-1] ) {
                    // Doing Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // If you did not swap a particular element which means there is
            // No need to i++ , Coz it'll be sorted.
            if(swapped  == false) {
                break;
            }
        }
    }
}
// o(n) complexity best.
// o(n2) complexity worst.