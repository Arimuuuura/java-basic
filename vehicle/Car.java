class Car extends Common {
    private int fuel = 100;

    Car (String name, String color) {
        super(name, color);
    }

    public void getFuel () {
        this.fuel -= this.getDistance();
        System.out.println("残燃料は" + this.fuel + "Lです");
        if (this.fuel < 20) {
            System.out.println("すぐに給油してください。");
        } else if (this.fuel < 60) {
            System.out.println("もう少しで給油が必要です。");
        } else {
            System.out.println("給油は不要です。");
        }
    }
}
