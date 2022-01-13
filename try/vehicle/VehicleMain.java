import java.util.Scanner;

class VehicleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TryPerson person1 = new TryPerson("Kate", "Jones", 27, 1.6, 50.0, "医者");
        TryPerson person2 = new TryPerson("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");

        TryBicycle bicycle = new TryBicycle("ビアンキ", "緑");

        bicycle.setOwner(person1);
        bicycle.getOwner().printData();
        person1.buy(bicycle);
        bicycle.printData();
        System.out.println("走る距離を入力してください：");
        Integer bicycleDistance = scan.nextInt();
        bicycle.run(bicycleDistance);

        System.out.println("=================");

        TryCar car = new TryCar("フェラーリ", "赤");

        car.setOwner(person2);
        car.getOwner().printData();
        person2.buy(car);
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
