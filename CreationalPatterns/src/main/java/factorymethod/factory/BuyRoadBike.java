package factorymethod.factory;

import factorymethod.product.Bike;
import factorymethod.product.RoadBike;

public class BuyRoadBike extends BuyBike {
    @Override
    public Bike buy() {
        return new RoadBike();
    }
}
