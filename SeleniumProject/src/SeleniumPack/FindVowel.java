package SeleniumPack;
import java.util.Scanner;
public class FindVowel {

	

	public static void main(String[] args) {
	        char ch;
	        System.out.println("Enter any Character ");
	        try (Scanner r = new Scanner(System.in)) {
	            ch = r.next().charAt(0);
	        }
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            System.out.print("Vowel ");

	        } else {
	            System.out.print("Consonant ");

	        }
	    

	}

}
