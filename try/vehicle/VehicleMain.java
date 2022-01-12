import java.util.Scanner;

class VehicleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TryBicycle bicycle = new TryBicycle("ビアンキ", "緑");

        bicycle.printData();
        System.out.println("走る距離を入力してください：");
        Integer bicycleDistance = scan.nextInt();
        bicycle.run(bicycleDistance);

        System.out.println("=================");

        TryCar car = new TryCar("フェラーリ", "赤");
        car.printData();
        System.out.println("走る距離を入力してください：");
        Integer carDistance = scan.nextInt();
        car.run(carDistance);
        System.out.println("-----------------");
        System.out.println("給油する量を入力してください：");
        Integer carFuel = scan.nextInt();
        car.charge(carFuel);
    }
}
