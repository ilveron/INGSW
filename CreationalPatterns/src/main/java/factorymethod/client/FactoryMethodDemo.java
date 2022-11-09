package factorymethod.client;

import factorymethod.factory.BuyBike;
import factorymethod.factory.BuyCityBike;
import factorymethod.factory.BuyMountainBike;
import factorymethod.factory.BuyRoadBike;
import factorymethod.product.Bike;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactoryMethodDemo {
    private static BuyBike factory;

    public static void run() {
        setup();
        Bike myBike = factory.buy();
        myBike.identify();
    }

    public static void setup(){
        Scanner in = new Scanner(System.in);
        printPrompt();
        byte type = in.nextByte();
        switch (type){
            case 1:
                factory = new BuyRoadBike();
                break;
            case 2:
                factory = new BuyMountainBike();
                break;
            case 3:
                factory = new BuyCityBike();
                break;
            default:
                throw new InputMismatchException("Invalid input");
        }
    }

    public static void printPrompt(){
        System.out.println("1: Road bike");
        System.out.println("2: Mountain bike");
        System.out.println("3: City bike");
        System.out.print("\tSelect the bike you want to buy: ");
    }
}
