public class L11_Exercise_Book {
    private String title;
    private String author;
    private int price;

    public void getBook() {
        System.out.println("タイトル:" + this.title + ", 著者:" + this.author + ", 価格:" + this.price);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    L11_Exercise_Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class UseL11_Exercise_Book {
    public static void main(String[] args) {
        L11_Exercise_Book b1 = new L11_Exercise_Book("TCP/IP 入門", "吉田茂樹", 2200);
        L11_Exercise_Book b2 = new L11_Exercise_Book("XMLのすべて", "高橋麻奈", 1800);
        L11_Exercise_Book[] array = {
            new L11_Exercise_Book("TCP/IP 入門", "吉田茂樹", 2200),
            new L11_Exercise_Book("XMLのすべて", "高橋麻奈", 1800),
            new L11_Exercise_Book("話せる英文法", "有小山博美", 1500),
        };

//        b1.getBook();
//        b2.getBook();

        for (L11_Exercise_Book obj: array) {
            obj.getBook();
        }
    }
}
