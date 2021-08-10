package factory.exercise.cars;

public abstract class Car {
    private double engineCapacity;
    private FuelType fuelType;
    private int productionYear;
    private String steeringWheelPosition;

    public Car(double engineCapacity, FuelType fuelType, int productionYear, String steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
