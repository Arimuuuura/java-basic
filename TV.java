class TV {
    void on(){
        System.out.println("on");
    }
    void off(){
        System.out.println("off");
    }
    void channel(){
        System.out.println("channel");
    }
}

class TVDVD extends TV {
    void record() {
        System.out.println("record");
    }
}

class UseDVDTV {
    public static void main(String[] args) {
        TVDVD dvdtv = new TVDVD();
        dvdtv.on();
        dvdtv.off();
        dvdtv.channel();
        dvdtv.record();
    }
}
