import java.net.PortUnreachableException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.text.html.HTMLDocument.RunElement;

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

// public class linearSearch {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {15,16,-22,-14,15},
//             {66,22,14,4,-15},
//             {4,15,-66,-22,4,15,-456}
//         }; // end of 2d array

//         int target = 4;
//         int[] ans = search(arr,target); // format of return value {row, col}
//         System.out.println(Arrays.toString(ans));
//         System.out.println(max(arr));

//     }

//     static int[] search(int[][] arr, int target) {
//         if ( arr.length == 0) {
//             //return -1;
//             return new int[]{-1,-1};
//         }
        
//         for (int i =0; i < arr.length ; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if ( arr[i][j] == target) {
//                     return new int[]{i,j};     
//                 }  
//             }
//         }
//         // we are returning in array so new int[]
//         return new int[]{-1,-1};
//     }

//     // function for minimum value

//     static int max(int[][] arr) {
//         int minimum = arr[0][0];

//         for (int i =0; i < arr.length ; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if ( arr[i][j] < minimum  ) {
//                     minimum = arr[i][j];
//                 }  
//             }
//         }
//         return minimum;
//     } // end of min Function

// }


// -------------------------------------------------------

// ? Even Digits 329 > odd 1224 > even 15547 > odd
//   print how many nunmbers are even

// public class linearSearch {
//     public static void main(String[] args) {
//         int[] nums = {12,345,2,6,7896};
//         System.out.println(findNumbers(nums));
//     }

//     static int findNumbers(int[] nums) {
//         int count = 0;
//         for ( int i =0; i < nums.length; i++) {
//             if (even(nums[i])) {
//                 count++;
//             }
//         }
//         return count;
//     }


//     // function to check wheater num is even or not
//     static boolean even(int num) {
//         int numberOfdigits = digits(num);
        
//         if ( numberOfdigits % 2 ==0) {
//             return true ;
//         }
//         return false;
        
//     }


//      // count number of digits in a number
//     static int digits(int num) {
        
//         // for negative value , convert to P+
        
//         if (num < 0) {
//             num = num * -1;
//         }
        
//         if (num == 0 ) {
//             return 1;
//         }
        
//         int count = 0;
//         while (num > 0) {
//             count++;
//             num = num / 10;
//         }
        
//         return count;
//     }
    
// }

//----------------------------------------------------
// ? Maximum Wealth 
// https://leetcode.com/problems/richest-customer-wealth/

public class linearSearch {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
        
    }
    public static int maximumWealth(int [][] accounts) {
        // person = rol 
        // account = col
        int ans = Integer.MIN_VALUE;
        for ( int person = 0; person < accounts.length; person++) {
            int sum = 0; 
            for ( int account  = 0 ; account < accounts[person].length ; account++ ) {
                sum += accounts[person][account]; 
            }

            // we have sum of accounts of person
            // check with oervall ans
            if ( sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
