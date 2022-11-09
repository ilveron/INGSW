package factorymethod.product;

public class MountainBike implements Bike {
    @Override
    public void identify() {
        System.out.println("You bought a Mountain Bike!");
    }
}
