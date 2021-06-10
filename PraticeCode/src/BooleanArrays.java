// Program to print out the contents of a boolean array 
public class BooleanArrays {
	public static void main(String[] args) {
		boolean[][] boolArray = {{true, false, true},
				                {false, true, true}};
		//method 1 to print 2D Array
//		for(int row = 0; row < boolArray.length; row ++) {
//			for(int col = 0; col < boolArray[row].length; col ++) {
//				if(boolArray[row][col]) { // if value is true  
//					System.out.println("t");
//				}else {
//					System.out.println("f"); //if value is false
//				}
//				
//			}
//			System.out.println();
//		}
		
		//method 2 to print out 2d array
		for(boolean [] row : boolArray) {
			for(boolean b : row) {
				System.out.println(b);
			}
			System.out.println();
		}
		
	}

}
