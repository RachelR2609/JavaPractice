//A game of tictactoe 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static ArrayList<Integer> playerPosition = new ArrayList<Integer>(); 
	static ArrayList<Integer> cpuPosition = new ArrayList<Integer>(); 

	public static void main(String[] args) {
		
		// printing out the game board
		char [] [] gameBoard = {{' ', '|', ' ', '|', ' '},
		                        {'-', '+', '-', '+', '-'},
		                        {' ', '|', ' ', '|', ' '},
		                        {'-', '+', '-', '+', '-'},
		                        {' ', '|', ' ', '|', ' '}};
		
		
		
		//Read player inputs for position on board 
		// Looping this runs forever
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your placement (1-9)");
			int playerPos = scan.nextInt();
			while(playerPosition.contains(playerPos) || cpuPosition.contains(playerPosition)) {
				System.out.println("Position not available! Choose a different position");
				playerPos = scan.nextInt();
				scan.close();
			}
			
			//If position is vacant then place 'X' on board
			placePiece(gameBoard, playerPos, "player");
			
			//Random placement for 'cpu' 
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1; // random number from 1 to 9
			while(playerPosition.contains(cpuPos) || cpuPosition.contains(cpuPosition)) {
			 cpuPos = rand.nextInt(9) + 1;
			}
			placePiece(gameBoard, cpuPos, "cpu");
	        printGameBoard(gameBoard);
	        
	        //Checking for a winner 
	        String result = checkWinner();
			if (result.length() > 0) {
				System.out.println(result);
				break;
			}
		}
	}
	
	
	public static void printGameBoard(char [][] gameBoard) {
		for(char [] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	
	//Method to place 'X' or 'O' symbols on board
	//depends on whether 'player' or 'cpu' is playing 
	public static void placePiece(char[][] gameBoard, int pos, String user) {
		char symbol = ' ';
		if(user.equals("player")) {
		 symbol = 'X';
		 playerPosition.add(pos);
	    } else if (user.equals("cpu")) {
	      symbol = 'O';
	      cpuPosition.add(pos);
	    }	
				
		//Different placement values on board (1-9)
		switch(pos) {
			case 1:
				gameBoard[0][0] = symbol;
				break;
			case 2:
				gameBoard[0][2] = symbol;
				break;
			case 3:
				gameBoard[0][4] = symbol;
				break;
			case 4:
				gameBoard[2][0] = symbol;
				break;
			case 5:
				gameBoard[2][2] = symbol;
				break;
			case 6: 
				gameBoard[2][4] = symbol;
				break;
			case 7:
				gameBoard[4][0] = symbol;
				break;
			case 8:
				gameBoard[4][2] = symbol;
				break;
			case 9:
				gameBoard[4][4] = symbol;
				break;
		    default:
		    	break;

		}
	}
	
	//Method to check is there is a winner after each iteration of game
	public static String checkWinner() {
		//Different win cases 
		List topRow = Arrays.asList(1, 2, 3);
		List minRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List leftCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List diagonal1 = Arrays.asList(1, 5, 9);
		List diagonal2 = Arrays.asList(3, 5, 7);
		
		List<List> winCases = new ArrayList<List>();
		
		winCases.add(topRow); // list inside a list 
		winCases.add(minRow);
		winCases.add(botRow);
		winCases.add(leftCol);
		winCases.add(midCol);
		winCases.add(rightCol);
		winCases.add(diagonal1);
		winCases.add(diagonal2);
		
		for (List l : winCases) {
			if (playerPosition.containsAll(l)) {
				return "Congrats you win!";
			} else if (cpuPosition.containsAll(l)) {
				return "CPU wins sorry :(";
			} else if(playerPosition.size() + cpuPosition.size() == 9) {
				return "Draw - nobody won!";
			}
		}
		return "";
	}
}
