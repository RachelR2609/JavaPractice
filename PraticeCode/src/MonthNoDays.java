//Program to see if year is a leap year
//also shows number of days in entered month 
import java.util.Scanner;

public class MonthNoDays {
	
	//Method to work out if year entered is leap year 
	//and number of days in input month 
	public static void monthDays(int month, int year) {
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){ // statement must be satisfied to be a leap year
			System.out.println("Year is a leap year!");
		}else {
			System.out.println("Year is not a leap year!");
		}
		switch(month) {
		case 1:
			System.out.println("January has 31 days ");
			break;
		case 2:
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println("February has 29 days");
			}else {
				System.out.println("February has 28 days");
			}
			break;
		case 3:
			System.out.println("March has 31 days");
			break;
		case 4:
			System.out.println("April has 30 days");
			break;
		case 5:
			System.out.println("May has 31 days");
			break;
		case 6:
			System.out.println("June has 30 days");
			break;
		case 7:
			System.out.println("July has 31 days");
			break;
		case 8:
			System.out.println("August has 31 days");
			break;
		case 9:
			System.out.println("September has 30 days");
			break;
		case 10:
			System.out.println("October has 31 days");
			break;
		case 11:
			System.out.println("November has 30 days");
			break;
		case 12:
			System.out.println("December has 31 days");
			break;
		default: 
			System.out.println("Not a valid input");
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose a number from 1 to 12 to choose a month...");
		int month = in.nextInt();
		System.out.println("Choose a year...");
		int year = in.nextInt();
		monthDays(month, year);
		in.close();

	}

}