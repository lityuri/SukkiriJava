package cardgeme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
	private ArrayList<Integer> hands = new ArrayList<Integer>();
	private int points = 0;

	public void setPoint(int point) {
		this.points = point;
		System.out.println("現在は" + this.points + "ポイント");
	}
	public int getPoint() {
		return this.points;
	}
	public List<Integer> getHands() {
		/*for (int i = 0; i < hands.size(); i++) {
			System.out.println(hands.get(i));
		}*/
		return this.hands;
	}
	public void setHands(Integer i) {
		this.hands.add(i);
	}

	public int select() {
		this.getHands();
		System.out.println("何番目の手札を選びますか");
		System.out.println(this.hands);
		int scan = new Scanner(System.in).nextInt() - 1;
		System.out.println(hands.get(scan));
		return 	this.removeHand(scan);
	}
	public int removeHand(int i) {
		return this.hands.remove(i);
	}
}
