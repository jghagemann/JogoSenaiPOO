package game;

public class Jokenpo {

	private int plays;

	String playTheGame(Player p1, Player pc) {

		switch (p1.getWeapon()) {
		case 1: {

			if (pc.getWeapon() == 2)
				return "Você perdeu!";
			else if (pc.getWeapon() == 3)
				return "Você ganhou! Parabéns!";
			else if (pc.getWeapon() == 1)
				return "Empatou!";
			else
				return "O computador escolheu uma arma inválida! Tente novamente.";
		}
		case 2: {

			if (pc.getWeapon() == 1)
				return "Você ganhou!";
			else if (pc.getWeapon() == 3)
				return "Você perdeu!";
			else if (pc.getWeapon() == 2)
				return "Empatou!";
			else
				return "O computador escolheu uma arma inválida! Tente novamente.";
		}

		case 3: {

			if (pc.getWeapon() == 1)
				return "Você perdeu! :( ";
			else if (pc.getWeapon() == 2)
				return "Você ganhou!";
			else if (pc.getWeapon() == 3)
				return "Empatou!";
			else
				return "O computador escolheu uma arma inválida! Tente novamente.";
		}
		default:
			return "Arma inválida!";
		}
	}

}