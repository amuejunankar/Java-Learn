public class StringBuilderTest {
    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26 ; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);  // adding ch value to Builder Basically in string 
            
        }

        System.out.println(builder.toString());
    }   
}
