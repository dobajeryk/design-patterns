package fasada.implementacja;

import fasada.przyklad.DeliveryBox;
import fasada.przyklad.DeliveryBoxSystem;

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
