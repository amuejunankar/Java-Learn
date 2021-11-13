public class largest_number_in_array {
    public static void main(String[] args) {

        int[] arrayofnum = {1,21,41,2,56};
        System.out.println(maxnum(arrayofnum));

    }
    static int maxnum(int[] arr) {
        int maxValue = arr[0];
        for(int i=0; i < arr.length  ; i++ ) { 
            if( arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}