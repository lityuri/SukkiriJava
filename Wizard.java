package game;

public class Wizard extends Character{
	private String name;
	private int hp;
	private int mp;
	private Wand wand;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name.length() <3 || name.length() > 8) {
			throw new IllegalArgumentException("設定される値が異常です");
		}
		this.name = name;
	}
	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("Wandの設定は必須です");
		}
		this.wand = wand;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("0以上の値を入力してください");
		}
		this.mp = mp;
	}

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	public void fireball(Monster m) {
		System.out.println(this.name + "は火の玉を放った");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
}
