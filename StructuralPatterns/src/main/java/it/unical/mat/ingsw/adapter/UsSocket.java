package it.unical.mat.ingsw.adapter;

public class UsSocket implements Socket {
    private final Integer VOLTS_PRODUCING = 110;

    @Override
    public Voltage getVoltage() {
        return new Voltage(VOLTS_PRODUCING);
    }
}
