package basic;
import java.util.Scanner;

class Uruu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("西暦を入力してください :");
		Integer year = scan.nextInt();

		if (year <= 0) {
			System.out.println("西暦を正確に入力してください");
			return;
		}

		if (year % 100 == 0 && year % 400 != 0) {
			System.out.println(year + "年は平年です");
		} else if (year % 4 == 0) {
			System.out.println(year + "年はうるう年です");
		} else {
			System.out.println(year + "年は平年です");
		}
	}
}
