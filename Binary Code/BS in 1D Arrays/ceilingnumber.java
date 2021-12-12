// Ceiling of a number > means smallest number >= target
// Floor Of a Number > means greatest number <= target

public class ceilingnumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,15,35,42,50,65,71,85};
        int target = 86;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // Return index.

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // if target is greater than the greatest number
        if ( target > arr.length -1 ) {
            return -1;
        }

        // start will end up with less or equal
        while(start <= end) {
            //  find the middle element
            
            // int mid = (start + end) / 2;  // this not good for large values
            // ! Better way to find mid 
            int mid = start + ((end - start) / 2);

            // target less than mid
            if ( target < arr[mid] ) {
                end = mid - 1;
            }

            // target greater than mid
            else if ( target > arr[mid] ) {
                start = mid + 1;
            }

            // target equals mid
            else {
                return mid;
            }

        }

        // ? start > Ceiling , end > Floor
        // returning the nearest target element 

        return start;    // for Ceiling of number > greater number than target

    }
}
