public class skipAWord {
    public static void main(String[] args) {
        System.out.println("Skipped A Apple word");
        System.out.println(skipApple("abapplegui"));
        System.out.println("Skip \"apple\" not \"apple\"");
        System.out.println(skipAppNotApple("abapplegui"));
        System.out.println(skipAppNotApple("abappgui"));
    }   
    static String skipApple(String Original) {
        // If A String is empty, return empty.
        if( Original.isEmpty() ) {
            return "";
        }

        // Check if it Have a word that we don't want.
        // Ex > apple
        // if it contains apple then ignore.
        if ( Original.startsWith("apple") ) {
            // skip the first 5 characters
            return skipApple(Original.substring(5));
        } else {
            return Original.charAt(0)  + skipApple(Original.substring(1));
        }
    }

    // Section 2 ---
    // Check if it Have a word that we don't want.
    // Ex > app
    // if it contains app when apple is not there.
    // we want to ignore "app" but not "apple"

    static String skipAppNotApple(String Original) {
        // If A String is empty

        if( Original.isEmpty() ) {
            return "";
        }

        if ( Original.startsWith("app") && !Original.startsWith("apple") ) {
            // skip the first 5 characters
            return skipAppNotApple(Original.substring(5));
        } else {
            return Original.charAt(0)  + skipAppNotApple(Original.substring(1));
        }
    }
}

