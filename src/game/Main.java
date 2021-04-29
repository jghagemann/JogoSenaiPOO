package game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Qual seu nome?");		
		Scanner jogador = new Scanner(System.in);
		
		String nomeDoJogador = jogador.nextLine();
		
		Jokenpo teste = new Jokenpo(nomeDoJogador);
		
		System.out.println("Bem vindo ao Pedra papel tesoura " + teste.getNomeDoJogador());
		
		//iniciar jogo();
	}

}

