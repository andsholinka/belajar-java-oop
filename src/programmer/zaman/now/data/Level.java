package programmer.zaman.now.data;

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),

    VIP("VIP Level");

    private String desc;

    Level(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return this.desc;
    }
}
