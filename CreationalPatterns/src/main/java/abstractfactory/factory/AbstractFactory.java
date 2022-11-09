package abstractfactory.factory;

import abstractfactory.product.Headphones;
import abstractfactory.product.Microphone;
import abstractfactory.product.Speaker;

public interface AbstractFactory {
    public Headphones createHeadphones();
    public Microphone createMicrophone();
    public Speaker createSpeaker();
}
