import java.util.ArrayList;


public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9,2};
        
        // LS1
        System.out.println(LS(arr, 2, 0));

        // LS2 This is ArrayList For multiple duplicates in array
        LS2(arr, 2, 0);
        System.out.println(list);

        // LS3 // Without Outer Scope
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(LS3(arr, 2, 0, list));

        // * if you want to store it the above data , store it into
        // * ArrayList

        // LS4 Without passing ArrayList as args
        System.out.println(LS4(arr, 2, 0));
    
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
    // this below is Public (list)
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
    public static ArrayList<Integer> LS3(int[] arr, int find, int index, ArrayList<Integer> list ) {
        // Base Condition 
        if ( index == arr.length) {
             return list; // return list
        }
        if ( arr[index] == find) {
            list.add(index);
        }
        return LS3(arr, find, index+1, list);
    }

    // TODO >  VVV IMPORTANT

    // !  Without passing ArrayList in argument & outer Scope <ArrayList>
    // ! Not Good Approach but many problems use this approad
    // why ? coz everytime a function create new ArrayList
    public static ArrayList<Integer> LS4(int[] arr, int find, int index ) {
        // new ArrayList ,
        ArrayList<Integer> list = new ArrayList<>();

        // Base Condition 
        if ( index == arr.length) {
             return list; // return list
        }

        // This will contain answer for that fucntion call only
        if ( arr[index] == find) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowFuncCalls =  LS4(arr, find, index+1);
        
        list.addAll(ansFromBelowFuncCalls);

        return list;
    }

}


//* Notes
//  Remember in "void" don't use "return" statement
