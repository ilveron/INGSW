package it.unical.mat.ingsw.chain_of_responsibility;

import it.unical.mat.ingsw.chain_of_responsibility.leaf.Pc;

public class ChainOfResponsibilityDemo {
    public static void run() {
        Router R1 = new Router("R1");
        Router R2 = new Router("R2");
        Router R3 = new Router("R3");

        Pc pc1 = new Pc("PC1", "1.1.1.1", R1);
        Pc pc2 = new Pc("PC2", "1.2.3.4", R1);
        Pc pc3 = new Pc("PC3", "1.0.0.10", R1);
        Pc pc4 = new Pc("PC4", "200.100.50.2", R2);
        Pc pc5 = new Pc("PC5", "160.55.0.100", R3);
        Pc pc6 = new Pc("PC6", "160.55.0.10", R3);

        R1.addLeaf(pc1);
        R1.addLeaf(pc2);
        R1.addLeaf(pc3);
        R2.addLeaf(pc4);
        R3.addLeaf(pc5);
        R3.addLeaf(pc6);

        R1.setNext(R2);
        R2.setNext(R3);

        pc1.sendPing("1.2.3.4");
        pc2.sendPing("200.100.50.2");
        pc3.sendPing("160.55.0.100");
        pc1.sendPing("69.69.69.69");
    }
}
