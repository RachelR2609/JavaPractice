//	Finding the average of an array
public class ArrayAverage {
	public static void main(String[] args) {
		int [] num = {1, 4, 17, 7, 25, 3, 100};  
		int sum = 0;
		double average = 0;
		
		// loop to work out average
		for(int i : num) {
			sum += i;
			average = sum/num.length;
		}
		System.out.println("The average is " + average);
		
		//loop to check if any element of array is > average 
		for(int i : num) {
			if (i > average) {
				System.out.println(i + " is greater than average!");
			
			}
		}
		
	}

}
