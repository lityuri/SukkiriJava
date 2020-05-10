package game;

public class Dancer extends Character{
	public void dance() {
		System.out.println(this.getName() + "は踊った");
	}
	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃");
		System.out.println("敵に5ポイントのダメージ");
		m.hp -= 5;
	}

}
