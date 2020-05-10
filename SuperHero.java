package game;

public class SuperHero extends Hero{
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println(this.getName() + "は飛び上がった");
	}
	public void land() {
		this.flying = false;
		System.out.println(this.getName() + "は着地した");
	}

	public SuperHero(String name) {
		this.setName(name);
	}
	public SuperHero() {
		this("Name");
		System.out.println("SuperHeroのコンストラクタが起動");
	}

	public void run() {
		System.out.println(this.getName() + "は撤退した");
		System.out.println("最終HPは" + this.getHp() + "でした");
	}
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
}
