public class SearchInMountain {
    public static void main(String[] args) {
        
    }

    // ? https://leetcode.com/problems/find-in-mountain-array/

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0 , peak);
        if ( firstTry != -1) {
            return firstTry;
        }
        // try to search in second half 
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    public int peakIndexInMountainArray (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while ( start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part in array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // You are in increasing part of the array
                start = mid + 1;

            }
        }

            // in the end , start == end poiting to the largest number because of the 2 number
            // start and end are always to find max element in abv 2 checks
            // hence when they are pointing to just one element 
            // , that is the max One bcoz that is what the checks saying

            // More Elaboration : at every point of time for start and end
            // , they have the best posibble answer till that time
            // and if  we are saying one item is remaining, hence coz of abv line
            // that is best possible answer

            return start; //  can also return end both are equal as in the 
            // end start, end is at one place
    
        }

        static int orderAgnosticBS( int[]arr, int target, int start, int end) {

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
