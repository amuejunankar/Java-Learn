
public class basic {
    public static void main(String[] args) {
        skip("","baccdah");
        System.out.println(skip1("abaabab"));
    }

    // PASSING TWO ARGUMENTS
    static void skip(String CreateNew, String Original) {
        // If A String is empty
        if( Original.isEmpty() ) {
            System.out.println(CreateNew);
            return;
        }

        char ch = Original.charAt(0);

        if ( ch == 'a') {
            skip(CreateNew , Original.substring(1));
        } else {
            skip(CreateNew + ch , Original.substring(1));
        }
    }

    // -----------------------------------------------------
    // PASSING ONE ARGUMENTS ONLY

    static String skip1(String Original) {
        // If A String is empty
        if( Original.isEmpty() ) {
            return "";
        }

        // First index of every newly made String object
        char ch = Original.charAt(0);
        
        if ( ch == 'a') {
            return skip1(Original.substring(1));
        } else {
            return ch + skip1(Original.substring(1));
        }
    }
}

// .substring(1) means 1 to String.length
// ex  hello in this case
// new string will be created as "ello"
// Then "llo" and so on
// by calling it again it will reduce by 1 everytime
