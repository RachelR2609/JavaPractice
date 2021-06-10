//code to swap the rows and columns of 2d array
public class ChangeArray {
	public static void main(String[] args) {
		//Predefined 2D array
		int [][] array1 = {{1, 2, 45, 46},
		                   {40, 34, 1, 2}};
		
		System.out.println("Original array: ");
		printArray(array1);
		System.out.println("Modified Array: ");
		modifyArray(array1);
		
		
	}  
	
	public static void modifyArray(int [][] array1) { //method to swap row and col values 
		int [][] array2 = new int[array1[0].length][array1.length]; //declare 2d array with set number of elements for row/col
		for(int row = 0; row < array1.length; row ++) {
			 for(int col = 0; col < array1[row].length; col++) {
				 array2[col][row] = array1[row][col];
			}
		}
		printArray(array2);

	}
	
	
	public static void printArray(int [][] array1) {
		for(int [] row : array1) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
