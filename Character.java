package game;

public abstract class Character {
	private String name;
	private int hp;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void run() {
		System.out.println(this.name + "逃げ出した");
	}
	public abstract void attack(Monster m) ;
	public void damage(int d) {
		setHp(getHp() - d);
	}


	public Character(String name) {
		setName(name);
	}
	public Character(String name , int hp) {
		this(name);
		setHp(hp);
	}
	public Character() {
		setName("Name");
	}
}
