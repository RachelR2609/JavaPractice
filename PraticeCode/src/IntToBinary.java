// Program to convert user input integer to binary 
// and calculate number of '0' bits
import java.util.Scanner;

public class IntToBinary {
	
	public static void main(String[] args) {
		//Taking in and reading user input
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Input any integer value...");
			int num = scan.nextInt();
			String numBin = Integer.toBinaryString(num); // converting to binary 
			System.out.println("The binary representation of " + num + " is: " + numBin);
			
			//finding out number of '0' bits
			 zeroBitCounter(numBin);
			
		}catch(java.util.InputMismatchException e){
			System.out.println("Oops, this is not an integer!");
			System.out.println("Please enter a new value...");
			scan.nextLine();
			
		}
		scan.close();
		
	}
	
	//method to calculate number of '0' bits
	public static void zeroBitCounter(String numBit) {
		int counter = 0;
		char zeroBit = '0';
		
		for(int i = 0; i < numBit.length(); i ++ ) {
			if(numBit.charAt(i) == zeroBit) {
				counter ++;
			}
		}
		System.out.println("There are " + counter + " '0' bits");
	}

}
