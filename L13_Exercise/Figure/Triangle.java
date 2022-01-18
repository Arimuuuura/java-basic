package L13_Exercise.Figure;

class Triangle extends Figure {
    private double area;
    private double base;
    private double height;

    Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setArea () {
        this.area = (base * height) / 2;
    }

    public double getArea () {
        return this.area;
    }
}
