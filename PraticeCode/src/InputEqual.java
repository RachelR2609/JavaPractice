//Program checks to see if all inputs are equal
import java.util.Scanner;
public class InputEqual{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Continuous Loop
			int num1;
			int num2;
			int num3;
			int num4;
			
			try {
				System.out.println("Type the first number: "  );
				num1 = scan.nextInt();
				System.out.println("Type the second number");
				num2 = scan.nextInt();
				System.out.println("Type the third number");
				num3 = scan.nextInt();
				System.out.println("Type the fourth number");
				num4 = scan.nextInt();
				
				if (num1 == num2 && num2 == num3 && num3 == num4 ) {
					System.out.println("The numbers are equal!");
				}else {
					System.out.println("The numbers are not equal!");
				}
				
			}catch(java.util.InputMismatchException e) {
				System.out.println("You can only type a number value!" );
				scan.nextLine(); 
			} finally {
				scan. close();
			}
	}
}

		