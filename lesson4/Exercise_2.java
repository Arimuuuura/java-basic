import java.util.Scanner;

class Exercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("商品の値段を入力してください");
        Integer price = scan.nextInt();
        double tax = 1.08;

        double addTaxPrice = (price * tax);
        System.out.println("税込" + (int)addTaxPrice + "円です");
    }
}
