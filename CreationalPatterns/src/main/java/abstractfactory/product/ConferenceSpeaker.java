package abstractfactory.product;

public class ConferenceSpeaker implements Speaker {
    @Override
    public void listen() {
        System.out.println("You bought a CONFERENCE SPEAKER for your old company because you wanted to apologize and get the work back");
    }
}
