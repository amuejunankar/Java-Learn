import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {

		String inpuString="accha hain hain", result = "";
		String allWords[];
		
		Scanner sc = new Scanner(System.in);
		inpuString = sc.nextLine().toLowerCase(); 		
		
		allWords = inpuString.split(" ");
		
		for(int i=0; i<allWords.length; i++) {
			for(int j=i+1; j<allWords.length; j++) {
				if(allWords[i].equals(allWords[j])) {
					allWords[j] = "remove";
				}
			}
		}
		
		for(String word: allWords) {
			if(word != "remove") {
				result = result + word + " ";
			}
		}
	
		System.out.println(result);

    }
}
