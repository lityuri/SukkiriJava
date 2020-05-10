package game;

public class intangibleAsset extends Asset{
	int usePrice;

	public intangibleAsset(String name, int usePrice) {
		super(name, usePrice);
		this.usePrice = usePrice;
	}
	public int getUsePrice() {
		return this.usePrice;
	}
}
