public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // First find the range
        // first start with a box of size 2

        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while( target > arr[end]) {
            int temp = end + 1;   // this is my 'newStart'
            // double the box value
            // end = previous end + sizeOfbox * 2;
            end = end + (end - start + 1) * 2; 
            start = temp;
        }
        return binSea(arr, target, start, end);
    }

    // FUNCTION : binSea
    // Without using .length function
    static int binSea(int[] arr, int target, int start, int end) {

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

        // no element found
        return -1;

    }   // end of Function binSea
} // end of class