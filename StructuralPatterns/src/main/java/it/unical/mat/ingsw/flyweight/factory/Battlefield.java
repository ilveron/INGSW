package it.unical.mat.ingsw.flyweight.factory;

import it.unical.mat.ingsw.flyweight.soldier.AllySoldier;
import it.unical.mat.ingsw.flyweight.soldier.AxisSoldier;
import it.unical.mat.ingsw.flyweight.soldier.Soldier;

import java.util.HashMap;

public class Battlefield {
    private static HashMap<String, Soldier> soldiersType = new HashMap<>();
    private static Battlefield instance = null;

    private Battlefield() {}

    public static Battlefield getInstance(){
        if(instance == null){
            instance = new Battlefield();
        }
        return instance;
    }

    public Soldier getSoldier(String type){
        Soldier s = null;

        if(soldiersType.containsKey(type)){
            s = soldiersType.get(type);
        }
        else {
            switch(type){
                case "Axis":
                    s = new AxisSoldier();
                    System.out.println("Axis soldier created");
                    break;
                case "Ally":
                    s = new AllySoldier();
                    System.out.println("Ally soldier created");
                    break;
                default:
                    System.out.println("Cannot create a soldier of type: "+type);
                    break;
            }
            soldiersType.put(type, s);
        }
        return s;
    }
}
