import java.util.Scanner;

public class L5_Exercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("言語を入力");
        String first = scan.next();
        System.out.println("言語を入力");
        String second = scan.next();
        System.out.println("言語を入力");
        String third = scan.next();
        System.out.println("言語を入力");
        String fourth = scan.next();
        String[] array = new String[]{first, second, third, fourth};
        System.out.println("言語1:" + array[0] + "," + "言語2:" + array[1] + "," + "言語3:" + array[2] + "," + "言語3:" + array[3]);
    }
}
