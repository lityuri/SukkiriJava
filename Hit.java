package cardgeme;

import java.util.Random;
import java.util.Scanner;

public class Hit extends Dealer{
	public void hit(Player p) {
		p.setPoint(0);
		System.out.println("数当てゲームです");
		kubaruKaisu(p);

		while (p.getHands().size() > 1) {

			System.out.println(p.getHands());

			Random r = new Random();
			int len = p.getHands().size();
			int ran = r.nextInt(len);

			System.out.println("何番目の数字を選びますか");
			int select = new Scanner(System.in).nextInt();

			if (select == ran) {
				System.out.println("あたり");
				int point = p.getPoint() + 1;
				p.setPoint(point);
				p.removeHand(select);
			} else {
				System.out.println("はずれ");
				p.removeHand(select);
			}
		}
		System.out.println("ゲーム終了。スコアは" + p.getPoint() + "です");
	}

}
