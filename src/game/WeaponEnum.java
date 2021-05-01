package game;

public enum WeaponEnum {

	ROCK(1, "Pedra"), PAPER(2, "Papel"), SCISSOR(3, "Tesoura");

	private int id;
	private String description;

	private WeaponEnum(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	public static String validateComputerChoice(int choice) {
		for (WeaponEnum weapon : WeaponEnum.values()) {
			if(weapon.getId() == choice) {
				return weapon.getDescription();
			}
		}
		return null;
	}

}
