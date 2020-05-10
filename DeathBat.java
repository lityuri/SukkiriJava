package game;

public class DeathBat extends FlyingMonster{
	public void attack(Character c) {
		System.out.println("コウモリは噛み付いた");
		System.out.println("5ポイントのダメージ");
		c.setHp(c.getHp() - 5);
	}
}
