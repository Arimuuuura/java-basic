class TryCar extends TryVehicle {
    private int fuel = 100;

    TryCar (String name, String color) {
        super(name, color);
    }

    public void run (int num) {
        System.out.println(num + "km走ります");
        if (num <= fuel) {
            this.distance += num;
            this.fuel -= num;
        } else {
            System.out.println("ガソリンが足りません");
        }
        System.out.println("走行距離：" + this.distance + "km");
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    public void charge (int addFuel) {
        System.out.println(addFuel + "L給油します");
        if (addFuel <= 0) {
            System.out.println("給油できません");
        } else if (addFuel + this.fuel >= 100) {
            this.fuel = 100;
        } else {
            this.fuel += addFuel;
        }
    }

    public void printData () {
        System.out.println("【車の情報】");
        super.printData();
        System.out.println("ガソリン量：" + this.fuel + "L");
        System.out.println("-----------------");
    }
}
