// say whether input letter is a constant or a vowel
import java.util.Scanner;

public class ConstantOrVowel {
	public static void main(String[] args) {
		//Taking a String from user 
		//and feeding it into constantOrVowel method 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a letter?");
		String s = scan.next();
		char c = s.charAt(0);
		constantOrVowel(c);
		scan.close();
		
	}
	
	
	//method to see if input is constant or vowel
	public static void constantOrVowel(char c) {
		switch(c) {
		case 'A':
		case 'a':
			System.out.println("Input letter is a constant");
			break;
		case 'B':
		case 'b':
			System.out.println("Input letter is a constant");
			break;
		case 'C':
		case 'c':
			System.out.println("Input letter is a constant");
			break;
		case 'D':
		case 'd':
			System.out.println("Input letter is a constant");
			break;
		case 'E':
		case 'e':
			System.out.println("Input letter is a vowel");
			break;
		case 'F':
		case 'f':
			System.out.println("Input letter is a constant");
			break;
		case 'G':
		case 'g':
			System.out.println("Input letter is a constant");
			break;
		case 'H':
		case 'h':
			System.out.println("Input letter is a constant");
			break;
		case 'I':
		case 'i':
			System.out.println("Input letter is a vowel");
			break;
		case 'J':
		case 'j':
			System.out.println("Input letter is a constant");
			break;
		case 'K':
		case 'k':
			System.out.println("Input letter is a constant");
			break;
		case 'L':
		case 'l':
			System.out.println("Input letter is a constant");
			break;
		case 'M':
		case 'm':
			System.out.println("Input letter is a constant");
			break;
		case 'N':
		case 'n':
			System.out.println("Input letter is a constant");
			break;
		case 'O':
		case 'o':
			System.out.println("Input letter is a vowel");
			break;
		case 'P':
		case 'p':
			System.out.println("Input letter is a constant");
			break;
		case 'Q':
		case 'q':
			System.out.println("Input letter is a constant");
			break;
		case 'R':
		case 'r':
			System.out.println("Input letter is a constant");
			break;
		case 'S':
		case 's':
			System.out.println("Input letter is a constant");
			break;
		case 'T':
		case 't':
			System.out.println("Input letter is a constant");
			break;
		case 'U':
		case 'u':
			System.out.println("Input letter is a vowel");
			break;
		case 'V':
		case 'v':
			System.out.println("Input letter is a constant");
			break;
		case 'W':
		case 'w':
			System.out.println("Input letter is a constant");
		    break;
		case 'X':
		case 'x':
			System.out.println("Input letter is a constant");
			break;
		case 'Y':
		case 'y':
			System.out.println("Input letter is a constant");
			break;
		case 'Z':
		case 'z':
			System.out.println("Input letter is a constant");
			break;
		default:
			System.out.println("Invalid input!");
		}
	}
	
}
