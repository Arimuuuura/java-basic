class SmartPhone extends HandyPhone implements Audio, Remotable {
    private int generation;
    SmartPhone (String number, String mail, int generation) {
        super(number, mail);
        this.generation = generation;
    };

    public void printData() {
        System.out.println("番号 : " + getNumber());
        System.out.println("Mail : " + getMail());
        System.out.println("回線 : " + this.generation + "G 回線");
        play();
        stop();
        upload();
        download();
    };

    // Audio interface の abstract
    public void play() {
        System.out.println("音楽再生");
    };

    public void stop() {
        System.out.println("音楽停止");
    };

    // Remotable interface の abstract
    public void upload () {
        System.out.println("データをアップロードしました");
    };

    public void download () {
        System.out.println("データをダウンロードしました");
    };
}
