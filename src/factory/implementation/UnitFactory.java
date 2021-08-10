package factory.implementation;

import factory.example.Rifleman;
import factory.example.Tank;
import factory.example.Unit;

public class UnitFactory extends Factory {
    @Override
    public Unit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMAN:
                return new Rifleman(100, 0, 10);
            default:
                throw new UnsupportedOperationException("No such type!");
        }
    }
}
