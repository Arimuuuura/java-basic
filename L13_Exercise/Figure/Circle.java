package L13_Exercise.Figure;

class Circle extends Figure {
    private double area;
    private double radius;
    private double pai = 3.14;

    Circle (double radius) {
        this.radius = radius;
    }

    public void setArea () {
        this.area = radius * radius * pai;
    }

    public double getArea () {
        return this.area;
    }
}
