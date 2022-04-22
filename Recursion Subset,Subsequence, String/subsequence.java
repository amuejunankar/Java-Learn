import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        // subseq("","abc");
        System.out.println(subseq1("","abc"));
    }

    static void subseq(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subseq(processed + ch, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }

    // *Using ArrayList
    
    static ArrayList<String> subseq1(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);
        ArrayList<String> left =subseq1(processed + ch, unprocessed.substring(1));
        ArrayList<String> right =subseq1(processed, unprocessed.substring(1));
    
        left.addAll(right);
        return left;
    }
}
