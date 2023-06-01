package it.unical.mat.ingsw.flyweight;

import it.unical.mat.ingsw.flyweight.factory.Battlefield;
import it.unical.mat.ingsw.flyweight.soldier.Soldier;
import it.unical.mat.ingsw.flyweight.soldier.Weapons;

import java.util.ArrayList;

public class FlyweightDemo {
    public static void run() {
        ArrayList<Soldier> soldiers = new ArrayList<>();
        for(int nFactions = 0; nFactions < 2; ++nFactions){
            for(int nSoldiers = 0; nSoldiers < 32; ++nSoldiers){
                if (nFactions == 0) {   //Get Axis
                    Soldier s = Battlefield.getInstance().getSoldier("Axis");
                    s.assignWeapon(Weapons.getInstance().getAxisWeapon());
                    s.doMission();
                }
                else {                  //Get Ally
                    Soldier s = Battlefield.getInstance().getSoldier("Ally");
                    s.assignWeapon(Weapons.getInstance().getAllyWeapon());
                    s.doMission();
                }
            }
        }
    }
}
