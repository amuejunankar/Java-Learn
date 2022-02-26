import java.util.ArrayList;


public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9,2};
        System.out.println(LS(arr, 2, 0));

        // This is ArrayList For multiple duplicates in array
        LS2(arr, 2, 0);
        System.out.print(list);

        // Without Outer Scope
        System.out.println(LS3(arr, 2, index, list));
        
        
    }

    public static boolean LS(int[] arr, int find, int index) {
        // base condition 
        if ( index == arr.length-1) {
             return false;
        }
        return arr[index] == find || LS(arr, find, index+1);
        // if ( arr[index] == find) {
        //     return true;
        // }
        // return LS(arr, find, index+1);
    }

    // ! With ArrayList / For Multiple target value in array with outer scope value
    // this is Public (list)
    static ArrayList<Integer> list = new ArrayList<>();
    public static void LS2(int[] arr, int find, int index) {
        // Base Condition 
        if ( index == arr.length) {
             return; // return Nothing
        }
        if ( arr[index] == find) {
            list.add(index);
        }
        LS2(arr, find, index+1);
    }

    // !  Without outer Scope <ArrayList>
    public static ArrayList LS3(int[] arr, int find, int index, ArrayList<Integer> list ) {
        // Base Condition 
        if ( index == arr.length) {
             return list; // return list
        }
        if ( arr[index] == find) {
            list.add(index);
        }
        LS2(arr, find, index+1);
    }
}


//* Notes
//  Remember in "void" don't use "return" statement
