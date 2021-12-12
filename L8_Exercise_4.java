import java.util.Scanner;

public class L8_Exercise_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("西暦を入力してください。");
		int year = scan.nextInt();
		leapYearJudgment(year);
	}

	static void leapYearJudgment(int year) {
		// 簡易バリデーション
		if (year < 1) {
			System.out.println("西暦を正しく入力してください。");
			return;
		}

		if (year % 100 == 0 && year % 400 != 0) {
			System.out.println(year + "年は平年です。");
		} else if (year % 4 == 0) {
			System.out.println(year + "年はうるう年です。");
		} else {
			System.out.println(year + "年は平年です。");
		}
	}
}
