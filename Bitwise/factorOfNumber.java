import java.util.ArrayList;

import javax.swing.text.html.StyleSheet;

// ? Any Number Divides N by perfectly without any remainder thats a factors of that number

public class factorOfNumber {
    public static void main(String[] args) {
        factors1(20);
        System.out.println();
        factors2(20);
        System.out.println();
        factors3(20);
    }
    // ! O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Another Optimized Method
    // ! O(sqrt(n))
    
    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i+" "+ n/i + " ");
                }
            }
        }
    }
    
    // above example gives, whiich is not sorted, but half element is in
    // ascending order and other in descending order
    // 1 36 2 18 3 12 4 9 6

    // Better Representation of factors2() functions
    // ! O()
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        // 20 10 5 from last we'll print
        for(int i = list.size() - 1 ; i >= 0 ; i--) {
            System.out.print(list.get(i)+ " ");
        }
    }

} // END OF FILE CLASS
