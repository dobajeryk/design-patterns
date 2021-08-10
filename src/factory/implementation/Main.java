package factory.implementation;

import factory.example.Unit;

public class Main {
    public static void main(String[] args) {
        UnitFactory unitFactory = new UnitFactory();
        Unit unit = unitFactory.createUnit(UnitType.TANK);
    }
}
