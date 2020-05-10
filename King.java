package game;

public class King {
	public void talk(Hero h) {

		System.out.println("王:フハハ、よく来たな" + h.getName());
		System.out.println("長旅大義であった");
		System.out.println("まずは様子見がてら街を歩いてくると良い");
		h.bye();
	}
}
