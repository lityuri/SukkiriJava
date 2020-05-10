package cardgeme;

public class Up extends Dealer{
	public void start(Player p) {
		p.setPoint(0);
		System.out.println("小さい順に手札を切るゲームです");
		kubaruKaisu(p);
		while (p.getHands().size() > 1) {
			int turn1 = p.select();
			int turn2 = p.select();
			if (turn1 < turn2) {
				int i = p.getPoint() + 1;
				p.setPoint(i);
			}
		}
		System.out.println("ゲーム終了。スコアは" + p.getPoint() + "です");
		//System.out.println("現在のポイントは" + p.getPoint());
	}

}
