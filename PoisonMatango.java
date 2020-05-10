package game;

public class PoisonMatango extends Matango{
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	int pp = 5;

	public void attack(Character c) {
		this.attack(c);
		if (pp >0) {
			System.out.println("毒キノコは毒を吐いた");
			int pdmg = c.getHp() / 5;
			System.out.println("毒で" + pdmg +"のダメージ");
			c.setHp(c.getHp() - pdmg);;
			pp --;
		}
	}
}
