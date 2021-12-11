package lesson5;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1人目の点数は？");
        Integer first = scan.nextInt();
        System.out.println("2人目の点数は？");
        Integer second = scan.nextInt();
        System.out.println("3人目の点数は？");
        Integer third = scan.nextInt();

        int [] array = new int[]{first, second, third};
        System.out.println("1人目:" + array[0] + "," + "2人目:" + array[1] + "," + "3人目:" + array[2]);
    }
}
