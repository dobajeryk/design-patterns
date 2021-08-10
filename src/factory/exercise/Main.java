package factory.exercise;

import factory.exercise.cars.BMWModel;
import factory.exercise.cars.Car;
import factory.exercise.cars.FordModel;
import factory.exercise.factory.CommonwealthFactory;
import factory.exercise.factory.ContinentalFactory;
import factory.exercise.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMax);
        System.out.println(ford.getSteeringWheelPosition());
    }
}
