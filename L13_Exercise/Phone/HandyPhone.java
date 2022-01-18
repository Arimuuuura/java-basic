class HandyPhone extends Phone {
    private String mail;

    HandyPhone (String number, String mail) {
        super(number);
        this.mail = mail;
    };

    public void printData() {
        System.out.println("番号 : " + getNumber());
        System.out.println("Mail : " + this.mail);
    };

    public void sendMail (String toAddress) {
        System.out.println(toAddress + " へMailを送信した");
    }

    public void setMail (String mail) {
        this.mail = mail;
    }

    public String getMail () {
        return this.mail;
    }
}
