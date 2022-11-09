package abstractfactory.product;

public class AudiophileMicrophone implements Microphone {
    @Override
    public void speak() {
        System.out.println("You're speaking into a nice AUDIOPHILE MICROPHONE. No noise will be generated from it, for sure");
    }
}
