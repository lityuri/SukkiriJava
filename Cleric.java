package game;

public class Cleric {
	String name;
	int hp;
	static final int MAXHP = 50;
	int mp;
	static final int MAXMP = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを発動した");
		this.mp -= 5;
		this.hp = 50;
		System.out.println(this.name + "のHPが最大まで回復した");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒祈った");
		int mp1 = this.MAXMP + sec + new java.util.Random().nextInt(2);
		if (mp1 >= this.mp) {
			mp1 = MAXMP;
		}
		System.out.println(this.name + "のMPが" + sec +"回復した");
		return mp1;
	}
}
