package game;

public class Hero extends Character{
	private String name;
	private int hp;
	static int money;
	private Sword sword;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name == null ) {
			throw new IllegalArgumentException("入力がnull。処理を中断");
		}
		if (name.length() <1) {
			throw new IllegalArgumentException("入力が短い。処理を中断");
		}
		if (name.length() >8) {
			throw new IllegalArgumentException("入力が長い。処理を中断");
		}
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int h) {
		if (h < 0) {
			throw new IllegalArgumentException("値がマイナス。処理を中断");
		}
		this.hp = h;
	}

	public void attack(Monster m) {
		System.out.println(this.name + "は攻撃した");
		System.out.println("敵に5ポイントのダメージ");
		m.hp -= 5;
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠った");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座って休んだ");
		System.out.println("HPが" + sec + "回復した");
	}
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println("5ポイントのダメージ");
	}
	public void run() {
	System.out.println(this.name + "は逃げ出した");
	System.out.println("最終HPは" + this.hp + "でした");
	}

	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
	public Hero() {
		this("Name");
		System.out.println("Heroのコンストラクタが起動");
	}
	public void bye() {
		System.out.println("勇者は「あばよ」と立ち去った");
	}
	private void die() {
		System.out.println(this.name + "は力尽きた");
		System.out.println("GAMEOVER");
	}

	public String toString() {
		return "名前:" + this.name + "/HP:" + this.hp;
	}
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} if (o instanceof Hero) {
			Hero h = (Hero)o;
			if (this.name.equals(h.name)) {
				return true;
			}
		} return false;
	}

	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}
}
class HeroMethod{
}
