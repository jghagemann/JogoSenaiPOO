package game;

public class GameBoard {
	private char [][] gameBoard = {
								  {' ', '|', ' ', '|', ' '}, 
						   		  {'-', '+', '-', '+', '-'}, 
						          {' ', '|', ' ', '|', ' '}, 
						          {'-', '+', '-', '+', '-'}, 
						          {' ', '|', ' ', '|', ' '}};
	
	public void printGameBoard() {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
