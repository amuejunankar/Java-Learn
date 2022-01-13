import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        
        String name = "Amit Junankar";
        // converted into char & showing as String (Array)
        System.out.println((Arrays.toString(name.toCharArray())));
        // Extra space will be removed
        System.out.println("    HEy     ".strip());
        // going to  split the string from " "  space
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
