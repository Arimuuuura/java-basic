class Common {
    private String name;
    private String color;

    Common (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getData () {
        return "車種 : " + this.name + ", 色 : " + this.color;
    }
}
