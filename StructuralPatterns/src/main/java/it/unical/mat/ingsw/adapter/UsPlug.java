package it.unical.mat.ingsw.adapter;

public class UsPlug {
    final Integer VOLTS_EXPECTED = 110;

    public Integer getVolts() {
        return VOLTS_EXPECTED;
    }

    public void connect(Voltage v){
        if(v.getVolts().equals(VOLTS_EXPECTED)){
            System.out.println("Charging correctly with 110 volts");
        }
        else{
            System.out.println("Homie, ya' plug's gonna set ya' hood on fire");
        }
    }
}
