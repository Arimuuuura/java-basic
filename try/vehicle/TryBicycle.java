class TryBicycle extends TryVehicle {
    TryBicycle (String name, String color) {
        super(name, color);
    }

    public void run (int num) {
        System.out.println(num + "km走ります");
        this.distance += num;
        System.out.println("走行距離：" + this.distance + "km");
    }

    public void printData () {
        System.out.println("【自転車の情報】");
        super.printData();
        System.out.println("-----------------");
    }
}
