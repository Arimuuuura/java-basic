import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        インスタンス生成
        Car car = new Car("プリウス", "黒");
        Bicycle bicycle = new Bicycle("ママチャリ", "赤");

//        car インスタンス
        System.out.println(car.getData());
        System.out.println("走行距離(km)を教えてください。");
        int carDistance = scan.nextInt();
        car.setDistance(carDistance);
        System.out.println(car.getDistance + "km 走行しました");
        car.getFuel();

//        bicycle インスタンス
        System.out.println("----------");
        System.out.println(bicycle.getData());
        System.out.println("走行距離(km)を教えてください。");
        int bicycleDistance = scan.nextInt();
        bicycle.setDistance(bicycleDistance);
        System.out.println(bicycle. getDistance + "km 走行しました");
    }
}
