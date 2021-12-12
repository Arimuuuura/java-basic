import java.util.Scanner;

public class L8_Exercise_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("3つの数値の合計を算出します。");

		int [] array = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1) + "番目の数値を入力してください。");
			int num = scan.nextInt();
			array[i] = num;
		}

		sumArray(array);
	}

	static void sumArray(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("合計は" + sum + "です");
	}
}
