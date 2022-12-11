package SeleniumPack;
import java.util.Scanner;

public class Characterfinding {
	

	    public static void main(String[] args) {
	        String E;
	        System.out.println("Enter statement:- ");
	        try (Scanner t = new Scanner(System.in)) {
	            E = t.nextLine();
	        }
	        for (int i = 0; i < E.length(); i++) {
	            if (E.charAt(i) == 'a' || E.charAt(i) == 'e' ||
	                    E.charAt(i) == 'i' || E.charAt(i) == 'o' ||
	                    E.charAt(i) == 'u') {

	                System.out.print(E.charAt(i) + " " + i);

	            }

	        }
	    }}


