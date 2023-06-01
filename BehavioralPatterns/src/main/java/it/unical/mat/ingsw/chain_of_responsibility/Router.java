package it.unical.mat.ingsw.chain_of_responsibility;

import it.unical.mat.ingsw.chain_of_responsibility.leaf.NetworkLeaf;
import it.unical.mat.ingsw.chain_of_responsibility.leaf.Pc;

import java.util.ArrayList;

public class Router {
    private String name;
    private ArrayList<NetworkLeaf> myLeaves;
    private Router next = null;

    public Router(String name){
        this.name = name;
        myLeaves = new ArrayList<>();
    }

    public void setNext(Router next){
        this.next = next;
    }

    public void addLeaf(Pc leaf){
        myLeaves.add(leaf);
    }

    public void handle(String ipSource, String ipDest){
        Boolean found = false;
        for(NetworkLeaf leaf : myLeaves){
            if(leaf.getIpAddress().equals(ipDest)){
                System.out.println(name + " handles the request");
                leaf.receivePing(ipSource);
                found = true;
                break;
            }
        }
        if(!found)
            if(next != null)
                next.handle(ipSource, ipDest);
            else
                System.out.println("The following IP address can't be found");
    }
}
