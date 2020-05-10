package game;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("入力された値が異常です");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}
	public void setPoser(double power) {
		if (name.length() <0.5 || name.length() > 100) {
			throw new IllegalArgumentException("入力された値が異常です");
		}
		this.power = power;
	}
}
