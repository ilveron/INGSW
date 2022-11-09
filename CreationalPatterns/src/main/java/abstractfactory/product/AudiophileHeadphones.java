package abstractfactory.product;

public class AudiophileHeadphones implements Headphones {
    @Override
    public void listen() {
        System.out.println("You're listening to some 192KHz/24 Bit FLAC files with your AUDIOPHILE HEADPHONES in your room");
    }
}
