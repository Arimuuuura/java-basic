package L13_Exercise.Figure;

class L13_Exercise {
    public static void main(String[] args) {
        Figure[] figures = {
            new Square(5),
            new Circle(5),
            new Triangle(5, 10),
        };

        for (Figure figure : figures) {
            figure.setArea();
            System.out.println(figure.getArea());
        };
    }
}
