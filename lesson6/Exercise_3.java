package lesson6;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("降水確率を入力してください");

        Integer rainyPercent = scan.nextInt();
        if (rainyPercent >= 70) {
            System.out.println("傘を必ず持っていきましょう。");
        } else if (rainyPercent >= 20) {
            System.out.println("傘はあった方がいいかも。");
        } else {
            System.out.println("傘はいらないでしょう。");
        }
    }
}
