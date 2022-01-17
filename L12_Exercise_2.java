class L12_Exercise_2 {
    private int x;
    private int y;

    L12_Exercise_2 (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public int getX () {
        return this.x;
    }

    public int getY () {
        return this.y;
    }

    public void getData () {
        System.out.println("x : " + this.x + ", y : " + this.y);
    }
}

class L12_Exercise_2_child extends L12_Exercise_2 {
    private String color;

    L12_Exercise_2_child (int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void getData () {
        System.out.println("x : " + getX() + ", y : " + getY() + ", color : " + this.color);
    }
}

class Use_L12_Exercise_2 {
    public static void main(String[] args) {
        L12_Exercise_2[] array = {
            new L12_Exercise_2(3, 9),
            new L12_Exercise_2_child(12, -3, "RED"),
            new L12_Exercise_2(56, 2),
            new L12_Exercise_2_child(7, -28, "BLUE"),
        };

        for (L12_Exercise_2 val: array) {
            val.getData();
        }
    }
}
