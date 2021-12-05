import java.util.Scanner;

class Uruu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("検査したい西暦を入力:");
		String year = scan.nextLine();

		System.out.println(year + "はうるう年です");
	}
}