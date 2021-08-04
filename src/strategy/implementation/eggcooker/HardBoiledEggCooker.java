package strategy.implementation.eggcooker;

public class HardBoiledEggCooker implements EggCooker {
    @Override
    public void cookEgg() {
        System.out.println("I am cooking hard-boiled eggs!");
    }
}
