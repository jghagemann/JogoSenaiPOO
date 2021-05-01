package game;

import static game.WeaponEnum.PAPER;
import static game.WeaponEnum.ROCK;
import static game.WeaponEnum.SCISSOR;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Jokenpo {

	private static final String LOSS_MESSAGE = "Você perdeu!";
	private static final String DRAW_MESSAGE = "Empatou!";
	private static final String WINNING_MESSAGE = "Você ganhou! Parabéns!";
	private Player p1;

	private String playTheGame() {
		int randomComputerWeapon = ThreadLocalRandom.current().nextInt(1, 3 + 1);

		switch (p1.getWeapon()) {
		case 1: {

			if (randomComputerWeapon == PAPER.getId()) {
				showComputerChoice(randomComputerWeapon);
				return LOSS_MESSAGE;				
			}
			else if (randomComputerWeapon == SCISSOR.getId()) {
				showComputerChoice(randomComputerWeapon);
				p1.addScore();
				return WINNING_MESSAGE;
			} else
				return DRAW_MESSAGE;

		}
		case 2: {

			if (randomComputerWeapon == ROCK.getId()) {
				showComputerChoice(randomComputerWeapon);
				p1.addScore();
				return WINNING_MESSAGE;
			} else if (randomComputerWeapon == SCISSOR.getId()) {
				showComputerChoice(randomComputerWeapon);				
				return LOSS_MESSAGE;
			}
			else
				return DRAW_MESSAGE;

		}

		case 3: {

			if (randomComputerWeapon == ROCK.getId()) {
				showComputerChoice(randomComputerWeapon);				
				return LOSS_MESSAGE;
			}
			else if (randomComputerWeapon == PAPER.getId()) {
				showComputerChoice(randomComputerWeapon);
				p1.addScore();
				return WINNING_MESSAGE;
			}

			else
				return DRAW_MESSAGE;

		}
		default:
			return "Arma inválida!";
		}
	}

	public void playerInfo() {
		System.out.println("Olá! Qual seu nome?");
		String playerName = createScanner().nextLine();
		this.p1 = new Player(playerName);

	}

	public void gameLoop() {
		boolean isGameRunning = true;
		while (isGameRunning) {

			System.out.println("Escolha sua arma:");
			System.out.println("1:");
			System.out.println("2:");
			System.out.println("3:");

			int weaponChoice = createScanner().nextInt();
			p1.setWeapon(weaponChoice);
			System.out.println(playTheGame());
			isGameRunning = shoudGameContinue();
		}
		System.out.println("Obrigado por jogar! Sua pontuação final é " + p1.getScore());
	}

	private boolean shoudGameContinue() {
		System.out.println("Quer continuar? (S para Sim, N para Não:");
		String answer = createScanner().nextLine();

		if (answer.equals("S")) {
			return true;
		} else {
			return false;
		}

	}

	private Scanner createScanner() {
		return new Scanner(System.in);
	}

	private void showComputerChoice(int choice) {
		System.out.println("O computador escolheu " + WeaponEnum.validateComputerChoice(choice));
	}
	
	public void runGame() {
		playerInfo();
		gameLoop();
	}

}