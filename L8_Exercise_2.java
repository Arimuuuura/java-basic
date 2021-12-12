import java.util.Scanner;

public class L8_Exercise_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("年月日を入力してください");
		System.out.println("年は？");
		int year = scan.nextInt();
		System.out.println("月は？");
		int month = scan.nextInt();
		System.out.println("日は？");
		int day = scan.nextInt();
		createDateFormat(year, month, day);
	}

	static void createDateFormat(int year, int month, int day) {
		if (year < 1) {
			System.out.println(year + "は、正しい年ではありません。");
			return;
		}
		if (month < 1 || 12 < month) {
			System.out.println(month + "は、正しい月ではありません。");
			return;
		}
		if (day < 1 || 31 < day) {
			System.out.println(day + "は、正しい日ではありません。");
			return;
		}
		System.out.println(year + " 年 " + month + " 月 " + day + " 日 ");
	}
}
