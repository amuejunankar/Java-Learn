import javax.sound.sampled.ReverbType;

public class linearSearch {
    public static void main(String[] args) {
        
        int[] nums = {12,14,15,665,44,4,444,20};
        int target = 100;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);

    }


    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length ; i++) {
            if ( target == arr[i] ) {
                return i;
            }
        }

        return -1;

    }
}