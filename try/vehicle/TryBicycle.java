class TryBicycle {
    private String name;
    private String color;
    private int distance = 0;

    TryBicycle (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void run (int num) {
        System.out.println(num + "km走ります");
        this.distance += num;
        System.out.println("走行距離：" + this.distance + "km");
    }

    public String getName () {
        return this.name;
    }

    public String getColor () {
        return this.color;
    }

    public void printData () {
        System.out.println("【自転車の情報】");
        System.out.println("名前：" + this.getName());
        System.out.println("色：" + this.getColor());
        System.out.println("走行距離：" + this.distance + "km");
        System.out.println("-----------------");
    }
}
