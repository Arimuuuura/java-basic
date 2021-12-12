import java.util.Scanner;

public class L8_Exercise_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("割り算をします。( a / b)");
		System.out.println("a の値を入力してください");
		Double num1 = scan.nextDouble();
		System.out.println("b の値を入力してください");
		Double num2 = scan.nextDouble();
		division(num1, num2);
	}

	static void division(Double num1, Double num2) {
		Double result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}
}
