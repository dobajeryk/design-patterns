package strategy.implementation.eggcooker;

public class SoftBoiledEggCooker implements EggCooker {

    @Override
    public void cookEgg() {
        System.out.println("I am cooking soft-boiled eggs!");
    }
}
