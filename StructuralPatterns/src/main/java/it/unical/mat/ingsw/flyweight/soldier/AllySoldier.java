package it.unical.mat.ingsw.flyweight.soldier;

import java.util.Random;

public class AllySoldier implements Soldier{
    private final String TASK;
    private String weapon;
    private static final Random r = new Random();


    public AllySoldier(){
        TASK = "kill Axis' soldiers";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void doMission() {
        System.out.println("Ally soldier with WEAPON " + weapon + " | TASK: " + TASK);
    }
}
