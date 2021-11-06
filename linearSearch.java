import java.net.PortUnreachableException;

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
//         // if target is not Found
//         return -1;

//     }
// }


// -----------------------------------------------------------

// ? Sorting array 


// public class linearSearch {
//     public static void main(String[] args) {
        
//         int[] nums = {12,14,15,665,44,4,444,20};
        

//         for( int i = 0; i < nums.length ; i++) {
//             for (int j=i+1; j < nums.length; j++) {
//                 int temp = 0;
//                 if( nums[i] > nums[j]) {
//                     temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = temp;
//                 }
//             }

//             System.out.print(nums[i]+ " ");
            
//         }
//     }
// }



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

// --------------------------------------------------------

// ? Max Value in an array

// public class linearSearch {
//     public static void main(String[] args) {
        
//         int[] nums = {12,14,15,24,44,4,444,20};
//         int maxnum = nums[0];

//         for( int i = 0; i < nums.length ; i++) {
//             if ( nums[i] > maxnum ) {
//                 maxnum = nums[i];
//             }
//         }

//         System.out.print("Max Value is > "+maxnum);
//     }
// }


// --------------------------------------------------------

// ? code of linear Search

// public class linearSearch {
//     public static void main(String[] args) {
//         String str = "Hey There";
//         char target = ' ';
//         System.out.println(search(str, target));
//     }


//     static boolean search(String str, char target) {
//         if ( str.length() ==0 ) {
//             return false;
//         }

//         for (int i=0 ; i < str.length();i++) {
//             if( target == str.charAt(i)) {
//                 return true;
//             }

//         }
//         // if char not found
//         return false;

//     } // end of fucntion "search"

// } // end of "main"

// -------------------------------------------------------

// ? Search In Range

// public class linearSearch {
//     public static void main(String[] args) {
        
//         int[] nums = {12,14,15,665,44,4,444,20};
//         int target = 4;
//         System.out.println("Found target at index > "+ LinearSearch(nums, target, 1, 6));

//     }

//     static int LinearSearch(int[] arr, int target, int start, int end) {
//         if (arr.length == 0) {
//             return -1;
//         }

//         for (int i = start; i <= end ; i++) {
//             if ( target == arr[i] ) {
//                 return i;
//             }
//         } 
//         //if target is not Found
//         return -1;

//     }
// }
// -------------------------------------------------------

// ? Minimum Number

// public class linearSearch {
//     public static void main(String[] args) {
        
//          int[] arr = {1,24,15,26,-7,-5,50,122,-2};
//          System.out.println(min(arr));
//     }

//     static int min(int[] arr) {
//         if ( arr.length == 0) {
//             return -1;
//         }
//         int tempmin = arr[0];

//         for ( int index = 1 ; index < arr.length; index++) {
//             if ( arr[index] < tempmin ) {
//                 tempmin = arr[index];
//             }
//         }
//         return tempmin;
//     }
// }

// -------------------------------------------------------

// ? Search In 2D Arrays

