package cardgeme;

import java.util.Random;
import java.util.Scanner;

public class Dealer {
	private int highscore = 0;

	public void kubaru(Player p) {
		Random ran = new Random();
		Integer hai = ran.nextInt(13);
		//System.out.println(hai);
		//Player p = new Player();
		p.setHands(hai);
	}
	public void kubaruKaisu(Player p) {
		System.out.println("何枚配りますか？");
		int kai;
		kai = new Scanner(System.in).nextInt();
		for (int i = 0; i < kai ; i ++) {
			kubaru(p);
		}
	}
}
