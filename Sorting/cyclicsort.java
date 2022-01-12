import java.util.Arrays;

// Range must be  in //? 1 to N

public class cyclicsort {
    public static void main(String[] args) {
        System.out.println("Cyclic Sort");
        int[] arr = {3,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }   
    // Cyclic Sorting.
    static void sort(int [] arr) {
        int i=0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if ( arr[i] != arr[correctIndex]) {
                swap(arr, i , correctIndex);
            } else {
                i++;
            }
        }
    }
    // Swap 
    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}