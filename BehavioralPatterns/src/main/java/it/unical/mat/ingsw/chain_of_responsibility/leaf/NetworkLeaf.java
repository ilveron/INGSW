package it.unical.mat.ingsw.chain_of_responsibility.leaf;

import it.unical.mat.ingsw.chain_of_responsibility.Router;

public abstract class NetworkLeaf {
    private String name;
    private String ipAddress;
    private Router gateway;

    public NetworkLeaf(String name, String ipAddress, Router gateway){
        this.name = name;
        this.ipAddress = ipAddress;
        this.gateway = gateway;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Router getGateway() {
        return gateway;
    }

    public void setGateway(Router gateway) {
        this.gateway = gateway;
    }

    public abstract void sendPing(String ipAddress);
    public abstract void receivePing(String source);
}
