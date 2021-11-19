public class Smallest_Letter_Larger_Than_Target {
    public static void main(String[] args) {
        String[] arr = {"c","f","j"};
        int target = 123;

        int ans = binSea(arr, target);
        System.out.println(ans);
    }

    // Return index.
    // 
    static int binSea(String[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
    }
}
