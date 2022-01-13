public class palindrome {
    public static void main(String[] args) {
        String Name = "abcdd";
        System.out.println(isPalindrome(Name));   
        String Name1 = "121";
        System.out.println(isPalindrome(Name1)); 
        String Name2 = "";
        System.out.println(isPalindrome(Name2)); 

    }

    static boolean isPalindrome(String str) {
        // Checking if it is null or Zero Length
        if(str == null || str.length() == 0) {
            return false;
        }
        
        str = str.toLowerCase();
        for( int i = 0 ; i < str.length()/2;i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 -i);

            if (start != end) {
                return false;
            }
        }

        return true;
    }
}
// Here we are trying with start and end point.
// many ways like use function reverse and check
// and  use stringBuilder
