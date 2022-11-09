package abstractfactory.client;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.AudiophileFactory;
import abstractfactory.factory.ConferenceFactory;
import abstractfactory.product.Headphones;
import abstractfactory.product.Microphone;
import abstractfactory.product.Speaker;
import factorymethod.factory.BuyCityBike;
import factorymethod.factory.BuyMountainBike;
import factorymethod.factory.BuyRoadBike;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AbstractFactoryDemo {
    private static AbstractFactory factory;

    public static void run(){
        setup();
        Headphones myHeadphones = factory.createHeadphones();
        Microphone myMicrophone = factory.createMicrophone();
        Speaker mySpeaker = factory.createSpeaker();

        myHeadphones.listen();
        myMicrophone.speak();
        mySpeaker.listen();
    }

    public static void setup(){
        Scanner in = new Scanner(System.in);
        printPrompt();
        byte type = in.nextByte();
        switch (type){
            case 1:
                factory = new AudiophileFactory();
                break;
            case 2:
                factory = new ConferenceFactory();
                break;
            default:
                throw new InputMismatchException("Invalid input");
        }
    }

    public static void printPrompt(){
        System.out.println("1: Audiophile");
        System.out.println("2: Conference");
        System.out.print("\tSelect the kind of products you are looking for: ");
    }
}
