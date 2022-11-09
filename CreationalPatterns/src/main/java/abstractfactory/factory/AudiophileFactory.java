package abstractfactory.factory;

import abstractfactory.product.*;

public class AudiophileFactory implements AbstractFactory {
    @Override
    public Headphones createHeadphones() {
        return new AudiophileHeadphones();
    }

    @Override
    public Microphone createMicrophone() {
        return new AudiophileMicrophone();
    }

    @Override
    public Speaker createSpeaker() {
        return new AudiophileSpeaker();
    }
}
