package game;

public class Matango extends WalkingMonster{
	int hp = 50;
	final int LEVEL = 10;
	char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public Matango() {
	}

	public void attack(Character c) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println(c + "に10のダメージ");
		c.setHp(c.getHp() - 10);
	}

	public void run() {
		System.out.println("マタンゴ" + this.suffix + "は逃げ出した");
	}
}
