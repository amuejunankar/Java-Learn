public class findArrSortOrNot {
    public static void main(String[] args) {
        // Find array sort or not
        int[] arr = {1,2,3,4,5,6};
        System.out.print(isSort(arr,0));
    }

    public static boolean isSort(int[] arr,int i) {
        // Base Conditon
        if ( i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i+1] && isSort(arr, i+1);
    }
}
