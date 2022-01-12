import java.util.ArrayList;

public class operator {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // add char
        System.out.println("a"+"b"); // add string
        System.out.println((char)('a'+3)); // add (char + num)
        System.out.println("a"+1);    // add (string + number)
        // same as "a" + "1"
        // imteger will be converted to (big) Integer that will call 
        // toString()
        
        System.out.println("Amit" + new ArrayList<>());
    }
}
