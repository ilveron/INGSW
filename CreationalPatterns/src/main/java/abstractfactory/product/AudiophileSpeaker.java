package abstractfactory.product;

public class AudiophileSpeaker implements Speaker {
    @Override
    public void listen() {
        System.out.println("You're listening to a 750MB WAV file of the THX Intro from your AUDIOPHILE SPEAKER");
    }
}
