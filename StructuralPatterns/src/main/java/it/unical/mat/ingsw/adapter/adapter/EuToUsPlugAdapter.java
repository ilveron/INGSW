package it.unical.mat.ingsw.adapter.adapter;

import it.unical.mat.ingsw.adapter.EuPlug;
import it.unical.mat.ingsw.adapter.UsPlug;
import it.unical.mat.ingsw.adapter.Voltage;

public class EuToUsPlugAdapter extends UsPlug {
    EuPlug plug;

    public EuToUsPlugAdapter(EuPlug plug){
        this.plug = plug;
    }

    public void connect(Voltage v){
        super.connect(v);
    }
}
