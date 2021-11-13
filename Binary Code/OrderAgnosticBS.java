public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,9,55,112,115,160};
        // Descending Order
        // int[] arr = {99,80,55,45,36,22,10,5,2,1};
        int target = 55;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

     static int orderAgnosticBS( int[]arr, int target) {
         int start = 0;
         int end = arr.length -1;

         // find ? array is ascending or descending 
         boolean isAscending;
         if ( arr[start] > arr[end]) {
             isAscending = true ;
         } else {
             isAscending = false;
         }

         // !Simple way or in Short.
         // boolean isAscending = arr[start] > arr[end];


         while(start <= end) {
            //  find the middle element
            
            // int mid = (start + end) / 2;  // this not good for large values
            // ! Better way to find mid 
            int mid = start + ((end - start) / 2);

            if ( arr[mid] == target) {
                return mid;
            }

            // if bool true means Ascending
            if ( isAscending) {
                if ( target < arr[mid] ) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            // descending order
            else {
                // 65 25 12 *10 5 6 2 1 just ex.
                if ( target < arr[mid] ) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            } 
        }

        // no element found
        return -1;
     }
}