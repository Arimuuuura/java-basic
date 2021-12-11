import java.util.Scanner;

public class L6_Exercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1~3の数字を入力してください");

        Integer input = scan.nextInt();
        switch (input) {
            case 1:
                System.out.println("Great!!");
                break;
            case 2:
                System.out.println("Good!");
                break;
            case 3:
                System.out.println("So So..");
                break;
            default:
                System.out.println("1~3の数字を入力してください");
                break;
        }
    }
}
