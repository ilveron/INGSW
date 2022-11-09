package factorymethod.product;

public class RoadBike implements Bike {
    @Override
    public void identify() {
        System.out.println("You bought a Road Bike!");
    }
}
