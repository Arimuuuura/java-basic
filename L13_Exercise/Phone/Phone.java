abstract class Phone {
    private String number;

    Phone (String number) {
        this.number = number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public String getNumber () {
        return this.number;
    }

    abstract void printData();
}
