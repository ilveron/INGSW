package abstractfactory.product;

public class ConferenceMicrophone implements Microphone {
    @Override
    public void speak() {
        System.out.println("You bought a CONFERENCE MICROPHONE just to yell back at your boss. Spoiler alert: you got fired");
    }
}
