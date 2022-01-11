class Car {
    private String name;
    private String color;

    Car (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getData () {
        return "車種 : " + this.name + ", 色 : " + this.color;
    }
}