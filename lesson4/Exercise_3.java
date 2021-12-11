import java.util.Scanner;

class Exercise_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("英語の点数は？");
        Integer english = scan.nextInt();
        System.out.println("数学の点数は？");
        Integer math = scan.nextInt();
        System.out.println("理科の点数は？");
        Integer science = scan.nextInt();

        Integer sum = english + math + science;
        float avr = (float)sum / 3;
        System.out.println("合計:" + sum + "," + "平均:" + avr);
    }
}
