package factorymethod.product;

public class CityBike implements Bike {
    @Override
    public void identify() {
        System.out.println("You bought a City Bike!");
    }
}
