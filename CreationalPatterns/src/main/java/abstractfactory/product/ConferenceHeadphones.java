package abstractfactory.product;

public class ConferenceHeadphones implements Headphones {
    @Override
    public void listen() {
        System.out.println("You bought a pair of CONFERENCE HEADPHONES just to hear your boss yelling directly at your soul");
    }
}
