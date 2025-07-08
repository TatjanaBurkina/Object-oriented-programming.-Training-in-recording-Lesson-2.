package model;

public class HotDrinkWithTemperature extends HotDrink {
    private final int temperature;

    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temperature: " + temperature + "°C";
    }
}
