import java.util.Arrays;

public class InsertioNSort {
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,8,7};
        SelecSort(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelecSort(int[] arr, int row, int col,int max) {
        if ( row == 0) {
            return;
        }
        if( col < row) {
            if ( arr[col] > arr[max] ) {
                SelecSort(arr,row,col+1, col);
            } else {
                SelecSort(arr,row,col+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            SelecSort(arr,row-1,0,0);
        }
    }
}
