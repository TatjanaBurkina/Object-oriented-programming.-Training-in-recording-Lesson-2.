package machine;

import model.HotDrinkWithTemperature;

public interface HotDrinkVendingMachine {
    HotDrinkWithTemperature getProduct(String name, int volume, int temperature);
}
