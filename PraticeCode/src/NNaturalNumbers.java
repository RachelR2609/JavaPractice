// Program to print out n-natural numbers and the sum of them
import java.util.Scanner;

public class NNaturalNumbers {
    //Method to print out n-natural numbers 
	public static void printNaturalNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
	//Sum
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("The sum of the natural numbers are " + sum);
	}
	
	
	public static void main(String[] args) {
		//Read user input and feed it into method
		Scanner numIn = new Scanner(System.in);
		System.out.println("How many natural numbers do you want to be displayed?");
		int n = numIn.nextInt();
		System.out.println("The first " + n + " natural numbers are: ");
		printNaturalNumbers(n);
		numIn.close();

	}

}
