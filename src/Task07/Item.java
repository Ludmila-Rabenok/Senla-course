package Task07;

public class Item {
    private String  name;
    private int volume;//объем
    private int value;//ценность

    public Item(String  name, int volume, int value) {
        this.name = name;
        this.volume = value;
        this.value = volume;
    }

    public String  getName(){
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getValue() {
        return value;
    }
}


