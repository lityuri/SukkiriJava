package game;

public class Slime extends WalkingMonster{
	public void run() {
		System.out.println("スライムはササッと逃げ出した");
	}
	public void attack(Character c) {
		System.out.println("スライムの粘液攻撃");
		System.out.println(c + "に5ポイントのダメージ");
		c.setHp(c.getHp() - 5);
	}
}
