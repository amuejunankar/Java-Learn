// ? Peak index in Mountain Array


public class mountain {
    public static void main(String[] args) {
    
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
}