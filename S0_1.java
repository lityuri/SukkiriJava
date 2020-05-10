package sukkiri;

public class S0_1 {
	public static void main(String[] args) {
		int doorClose = 0;
		while (doorClose == 0) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
			int doorClose1 = new java.util.Random().nextInt(2);
			doorClose += doorClose1;
		}
		System.out.println("扉が開いた…");
		}
}
