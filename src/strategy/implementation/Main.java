package strategy.implementation;

import strategy.implementation.eggcooker.HardBoiledEggCooker;
import strategy.implementation.eggcooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {

        // new order - hard-boiled eggs
        Chef chef = new Chef("Gordon Gesler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();

        // new order - soft-boiled eggs
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
