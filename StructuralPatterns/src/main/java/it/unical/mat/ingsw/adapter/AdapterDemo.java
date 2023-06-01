package it.unical.mat.ingsw.adapter;

import it.unical.mat.ingsw.adapter.adapter.EuToUsPlugAdapter;
import it.unical.mat.ingsw.adapter.adapter.UsToEuPlugAdapter;

public class AdapterDemo {
    public static void run(){
        EuSocket euSocket = new EuSocket();
        UsSocket usSocket = new UsSocket();
        UsPlug usPlug = new UsPlug();
        EuPlug euPlug = new EuPlug();

        System.out.println("EU -> EU");
        euPlug.connect(euSocket.getVoltage());
        System.out.println();

        System.out.println("EU -> US");
        euPlug.connect(usSocket.getVoltage());
        System.out.println();

        System.out.println("US -> US");
        usPlug.connect(usSocket.getVoltage());
        System.out.println();

        System.out.println("US -> EU");
        usPlug.connect(euSocket.getVoltage());
        System.out.println();

        System.out.println("AdaptedUS -> US");
        UsPlug adaptedUs = new EuToUsPlugAdapter(euPlug);
        adaptedUs.connect(usSocket.getVoltage());
        System.out.println();

        System.out.println("AdaptedEU -> EU");
        EuPlug adaptedEu = new UsToEuPlugAdapter(usPlug);
        adaptedEu.connect(euSocket.getVoltage());
    }
}
