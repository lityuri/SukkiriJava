package game;

public abstract class Monster {
	int hp;
	int mp;
	char suffix;

	public abstract void attack(Character c);
	public void run() {
		System.out.println("モンスターは逃げ出した");
	}
}
