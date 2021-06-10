//Program to determine whether input integer is positive of negative
import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		//Read user input 
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Type out any number...");
		num = scan.nextInt();
		
		//Convert integer to String
		//See if String contains '-' sign
		String newNum = Integer.toString(num);
		Boolean isNegative;
		if(newNum.contains("-")) {
			isNegative = true;
			System.out.println(num + " is neagtive");
		}else {
			isNegative = false;
			System.out.println(num + " is positive");
		}
	    
		scan.close();
	}

}