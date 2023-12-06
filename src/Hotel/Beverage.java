package Hotel;

public class Beverage extends MenuItems{
    private String type;
    private int volume;
    public Beverage(String name, double price, int volume, String type){
        super(name, price);
        this.volume = volume;
        this.type = type;
    }
    public Beverage(String name, double price, String description, int volume, String type){
        super(name, price);
        this.volume = volume;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
