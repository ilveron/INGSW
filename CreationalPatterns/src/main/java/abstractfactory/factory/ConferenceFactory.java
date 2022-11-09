package abstractfactory.factory;

import abstractfactory.product.*;

public class ConferenceFactory implements AbstractFactory {
    @Override
    public Headphones createHeadphones() {
        return new ConferenceHeadphones();
    }

    @Override
    public Microphone createMicrophone() {
        return new ConferenceMicrophone();
    }

    @Override
    public Speaker createSpeaker() {
        return new ConferenceSpeaker();
    }
}
