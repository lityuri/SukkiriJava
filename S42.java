package sukkiri;

public class S42 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("画面に1文字の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] == input) {
				System.out.println("アタリ");
				System.out.println(numbers[i]);
			}
		}
	}
}
