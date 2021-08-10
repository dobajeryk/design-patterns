package factory.implementation;

import factory.example.Unit;

public abstract class Factory {
    public abstract Unit createUnit(UnitType unitType);
}
