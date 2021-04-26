package game;

import java.util.Scanner;

public class GameInteractions {
	private Match match;

	Scanner scanner = new Scanner(System.in);

	public void start() {
		System.out.println("Qual o nome do Jogador 1?");
		String player1Name = scanner.nextLine();

		System.out.println("Qual o nome do Jogador 2?");
		String player2Name = scanner.nextLine();

		Player player1 = new Player(player1Name, "X");
		Player player2 = new Player(player2Name, "O");
		
		match = new Match(player1, player2);

	}
}
