import java.util.Scanner;

public class L7_Exercise_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] array = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + "人目の点数は？");
			Integer point = scan.nextInt();
			array[i] = point;
		}

		int max = array[0];
		for (int i = 0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			System.out.println((i+1) + "人目の点数は" + array[i] + "です");
		}
		System.out.println("最高点は" + max + "です");
	}
}
