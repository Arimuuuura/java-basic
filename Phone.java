class Phone_Practice {
    String serial;

    Phone_Practice (String serial) {
        setSerial(serial);
        this.call();
        System.out.println("番号 : " + this.getSerial());
    }

    public void setSerial (String serial) {
        this.serial = serial;
    }

    public String getSerial () {
        return this.serial;
    }

    public void call () {
        System.out.println("プルル〜〜");
    }
}

class SmartPhone_Practice extends Phone_Practice {
    private int generation;

    SmartPhone_Practice(String serial, int generation) {
        super(serial);
        setGeneration(generation);
        System.out.println("回線 : " + this.getGeneration() + "G");
    }

    public void setGeneration (int generation) {
        this.generation = generation;
    }

    public int getGeneration () {
        return this.generation;
    }
}

class UsePhone_Practice {
    public static void main(String[] args) {
        SmartPhone_Practice smartPhone = new SmartPhone_Practice("000-000", 5);
    }
}
