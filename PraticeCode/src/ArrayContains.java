//Here we try to find if an item x, can be found in a given array 
// using user input 
import java.util.Scanner;

public class ArrayContains {
	
	static boolean result = true;
	
	public static boolean itemFound(int [] array, int item) {  //method taking two parameters and returning a boolean value
		for(int i = 0; i < array.length; i ++) {
			if(item == array[i]) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int [] nums = {2, 3, 100, 25, 26, 356};
		System.out.println("What item are you looking for?");
		int itemIn = in.nextInt();
		boolean result = itemFound(nums, itemIn);
		
		if(result == true) {
			System.out.println("Item has been found!");
		}else {
			System.out.println("Sorry, item could not be found");
		}
		in.close();
		
	}

}
