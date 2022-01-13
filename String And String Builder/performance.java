// Video Linkl : https://www.youtube.com/watch?v=zL1DPZ0Ovlo

public class performance {
    public static void main(String[] args) {
        // empty string
        String series = ""; 

        for(int i = 0; i < 26 ; i++) {
            char ch = (char)('a'+i);
            // System.out.println(ch);
            series +=  " " +ch; // "" used for spacing betn
        }
        // Printing.
        System.out.println(series); 

        // ! above thing is bad in complexity On2
        // because everytime it creates new object while adding next element

        // check StringBuilderTest.java file for better performance
        
    }       
}
