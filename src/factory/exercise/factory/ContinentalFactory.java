package factory.exercise.factory;

import factory.exercise.cars.*;

public class ContinentalFactory extends Factory {
    @Override
    public Car buildBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case X5:
                return new BMW(1.8, FuelType.DIESEL, 2020, "LEFT");
            case E60:
                return new BMW(2.8, FuelType.DIESEL, 2020, "LEFT");
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    @Override
    public Car buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMax:
                return new Ford(1.8, FuelType.DIESEL, 2020, "LEFT");
            case Focus:
                return new Ford(2.8, FuelType.DIESEL, 2020, "LEFT");
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }
}
