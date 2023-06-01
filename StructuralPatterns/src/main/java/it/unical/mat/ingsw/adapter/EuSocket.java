package it.unical.mat.ingsw.adapter;

public class EuSocket implements Socket {
    private final Integer VOLTS_PRODUCING = 220;

    @Override
    public Voltage getVoltage() { return new Voltage(VOLTS_PRODUCING); }
}
