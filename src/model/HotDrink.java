package model;

public class HotDrink {
    private final String name;
    private final int volume;

    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Drink: " + name + ", Volume: " + volume + "ml";
    }
}
