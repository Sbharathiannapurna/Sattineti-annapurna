package programs;
import java.util.Scanner;

public class Reversesentence {
	
	
	    public static String reverseSentance(String sentence) {
	        String[] words = sentence.split("\\s+");
	        StringBuilder reverseSentence = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reverseSentence.append(words[i]);
	            if (i != 0) {
	                reverseSentence.append(" ");
	            }
	        }
	        return reverseSentence.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String inputSentence = scanner.nextLine();
	        scanner.close();
	        
	        String reverseSentence = reverseSentance(inputSentence);
	        System.out.println("Reversed sentence: " + reverseSentence);
	    }
	
}
