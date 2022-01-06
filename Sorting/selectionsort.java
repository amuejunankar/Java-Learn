import java.util.Arrays;

// ? Short Notes
// First Find large Number
// Then swap large with last-i index
// repeat.

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {3,4,-2,8,2,1};

        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void selection(int[] arr) {
        // here i is used for passing till  i < length

        for (int i = 0; i< arr.length; i++) {
            // find max item in the remaining array and swap to correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    // To Take Highest number
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i<= end;i++)  {
            if( arr[max] < arr[i] ) {
                max = i;
            }
        }
        return max;
    }

    // For swapping
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// o(n)2 Complexity