public class pretty_printing {
    public static void main(String[] args) {
        float a = 36.14524f;

        System.out.printf("Value till decimal digit > %.2f", a);

        System.out.printf("\nTill 3rd decimal > %.3f", Math.PI);
        
        System.out.printf("I am %s","Amit");
    }
}

// ? Notes:
// It Also round Figures value like ex 15.56 > 15.6
// % > Place Holder
// ".3" or ".2" > till that decimal to print
// in last give "f" or "s" > Represents datatype