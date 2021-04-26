package game;

public class Player {

	/**
	 * 
	 * @param name    nome do jogador
	 * @param playsAs joga como X ou O
	 * @param matchesWon   número de partidas ganhas
	 */
	private String name;
	private String playsAs;
	private int matchesWon = 0;

	public Player(String name, String playsAs) {
		super();
		this.name = name;
		this.playsAs = playsAs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlaysAs() {
		return playsAs;
	}

	public void setPlaysAs(String playsAs) {
		this.playsAs = playsAs;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

}
