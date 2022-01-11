class Main {
    public static void main(String[] args) {
        Car car = new Car("プリウス", "黒");
        Bicycle bicycle = new Bicycle("ママチャリ", "赤");
        System.out.println(car.getData());
        System.out.println(bicycle.getData());
    }
}
