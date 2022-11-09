package factorymethod.factory;

import factorymethod.product.Bike;
import factorymethod.product.CityBike;

public class BuyCityBike extends BuyBike {
    @Override
    public Bike buy() {
        return new CityBike();
    }
}
