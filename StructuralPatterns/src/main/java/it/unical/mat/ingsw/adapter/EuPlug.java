package it.unical.mat.ingsw.adapter;

public class EuPlug {
    final Integer VOLTS_EXPECTED = 220;

    public Integer getVolts() {
        return VOLTS_EXPECTED;
    }

    public void connect(Voltage v){
        if(v.getVolts().equals(VOLTS_EXPECTED)){
            System.out.println("Charging correctly with 220 volts");
        }
        else{
            System.out.println("Sir, your plug went officially boom");
        }
    }
}
