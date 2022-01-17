class L12_Exercise {
    private int price;

    L12_Exercise (int price) {
        this.price = price;
    }

    public int getPrice () {
        return this.price;
    }
}

class L12_Exercise_child extends L12_Exercise {
    private String title;
    private String company;

    L12_Exercise_child (int price, String title, String company) {
        super(price);
        this.title = title;
        this.company = company;
    }

    public void printData () {
        System.out.println("タイトル : " + this.title);
        System.out.println("出版社 : " + this.company);
        System.out.println("価格 : " + getPrice() + "円");
    }
}

class Use_L12_Exercise {
    public static void main(String[] args) {
        L12_Exercise_child book = new L12_Exercise_child(1400, "刑事コロンボ", "ABC出版");
        book.printData();
    }
}
