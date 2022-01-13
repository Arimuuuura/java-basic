abstract class TryVehicle {
    private String name;
    private String color;
    protected int distance = 0;

    TryVehicle (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void run (int distance);

    public void printData () {
        System.out.println("名前：" + this.getName());
        System.out.println("色：" + this.getColor());
        System.out.println("走行距離：" + this.distance + "km");
    }

    public String getName () {
        return this.name;
    }

    public String getColor () {
        return this.color;
    }
}