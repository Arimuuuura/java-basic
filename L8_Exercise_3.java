import java.util.Scanner;

public class L8_Exercise_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("テストの点数を教えてください");
		int score = scan.nextInt();
		scoreJudgment(score);
	}

	static void scoreJudgment(int score) {
		if (score >= 70) {
			System.out.println(score + "点は合格です。");
		} else {
			System.out.println(score + "点は不合格です。");
		}
	}
}
