package L13_Exercise.Figure;

class Square extends Figure {
    private double area;
    private double width;

    Square (int width) {
        this.width = width;
    }

    public void setArea () {
        this.area = width * width;
    }

    public double getArea () {
        return this.area;
    }
}
