package machine;

import model.HotDrinkWithTemperature;

public class BasicHotDrinkMachine implements HotDrinkVendingMachine {
    @Override
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}
