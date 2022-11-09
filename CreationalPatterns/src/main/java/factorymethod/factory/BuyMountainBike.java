package factorymethod.factory;

import factorymethod.product.Bike;
import factorymethod.product.MountainBike;

public class BuyMountainBike extends BuyBike {
    @Override
    public Bike buy() {
        return new MountainBike();
    }
}
