package factory.exercise.factory;

import factory.exercise.cars.BMWModel;
import factory.exercise.cars.Car;
import factory.exercise.cars.FordModel;

public abstract class Factory {
    public abstract Car buildBMW(BMWModel bmwModel);
    public abstract Car buildFord(FordModel fordModel);
}
