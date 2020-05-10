package sukkiri;

public class Person {
	int age;
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException
					("年齢は正の値です。値=" + age);
		}
		this.age = age;
	}
}

