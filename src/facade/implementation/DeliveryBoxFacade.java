package facade.implementation;

import facade.example.DeliveryBox;
import facade.example.DeliveryBoxSystem;

public class DeliveryBoxFacade {
    private final DeliveryBox deliveryBox = new DeliveryBox();
    private final DeliveryBoxSystem deliveryBoxSystem = new DeliveryBoxSystem();

    public void pickupPackage() {
        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox();
        }

    }
}
