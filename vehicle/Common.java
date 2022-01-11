class Common {
    private String name;
    private String color;
    private int distance = 0;

    Common (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getData () {
        return "車種 : " + this.name + ", 色 : " + this.color;
    }

    public int getDistance () {
        return distance;
    }

    public void setDistance (int distance) {
        this.distance = distance;
    }
}
