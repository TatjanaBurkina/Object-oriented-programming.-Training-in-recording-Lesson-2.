package app;

import model.HotDrinkWithTemperature;
import machine.BasicHotDrinkMachine;

public class Main {
    public static void main(String[] args) {
        BasicHotDrinkMachine machine = new BasicHotDrinkMachine();

        HotDrinkWithTemperature coffee = machine.getProduct("Coffee", 250, 80);
        HotDrinkWithTemperature tea = machine.getProduct("Tea", 200, 70);

        System.out.println(coffee);
        System.out.println(tea);
    }
}
