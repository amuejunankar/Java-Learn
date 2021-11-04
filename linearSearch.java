// import javax.sound.sampled.ReverbType;

// public class linearSearch {
//     public static void main(String[] args) {
        
//         int[] nums = {12,14,15,665,44,4,444,20};
//         int target = 100;
//         int ans = LinearSearch(nums, target);
//         System.out.println(ans);

//     }


//     static int LinearSearch(int[] arr, int target) {
//         if (arr.length == 0) {
//             return -1;
//         }

//         for (int i = 0; i < arr.length ; i++) {
//             if ( target == arr[i] ) {
//                 return i;
//             }
//         }

//         return -1;

//     }
// }


// -----------------------------------------------------------

// ? Sorting array 


public class linearSearch {
    public static void main(String[] args) {
        
        int[] nums = {12,14,15,665,44,4,444,20};
        

        for( int i = 0; i < nums.length ; i++) {
            for (int j=i+1; j < nums.length; j++) {
                int temp = 0;
                if( nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

            System.out.println(nums[i]);
            
        }
    }
}



//------------------------------------------------------------
// ? Sorting array using inbuilt function()

// import java.util.Arrays;
// import javax.sound.sampled.ReverbType;

// public class linearSearch {
//     public static void main(String[] args) {
        
//         int[] nums = {12,14,15,665,44,4,444,20};
//         Arrays.sort(nums);

//         for( int i = 0; i < nums.length ; i++) {
//             System.out.print(nums[i]+" ");
//         }
//     }
// }


