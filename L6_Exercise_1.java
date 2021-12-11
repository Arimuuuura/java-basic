import java.util.Scanner;

public class L6_Exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("月を入力してください");

        Integer month = scan.nextInt();
        if ((0 < month) && (month <= 12)) {
            System.out.println(month + "月は正しい月です");
        } else {
            System.out.println(month + "月は正しくない月です");
        }
    }
}
