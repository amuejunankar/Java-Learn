public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 8 , 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if ( s > e) {
            return -1;
        }

        int mid = s + (e-s) / 2;
        if ( arr[mid] == target) {
            return mid;
        }
        // start to mid
        if(arr[s] <= arr[mid]) {
            // target > start AND < mid
            if (target >= arr[s] && target <= arr[mid]) {
                return search(arr, target, s, mid-1);
            } else {
                return search(arr, target, mid+1, e);
            }
        }
        // target > Mid AND < end
        if ( target >= arr[mid] && target <= arr[e]) {
            return search(arr, target, mid+1, e);
        }
        // Otherwise search in another array mid-1
        return search(arr, target, s, mid-1);

    }
}
