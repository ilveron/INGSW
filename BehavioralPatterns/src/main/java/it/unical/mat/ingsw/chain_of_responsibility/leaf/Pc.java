package it.unical.mat.ingsw.chain_of_responsibility.leaf;

import it.unical.mat.ingsw.chain_of_responsibility.Router;

public class Pc extends NetworkLeaf {
    public Pc(String name, String ipAddress, Router gateway) {
        super(name, ipAddress, gateway);
    }

    @Override
    public void sendPing(String ipAddress) {
        System.out.println(super.getIpAddress() + " is sending a ping to: " + ipAddress);
        super.getGateway().handle(super.getIpAddress(), ipAddress);
    }

    @Override
    public void receivePing(String source) {
        System.out.println(super.getIpAddress() + " received a ping from: " + source);
        System.out.println();
    }

}
