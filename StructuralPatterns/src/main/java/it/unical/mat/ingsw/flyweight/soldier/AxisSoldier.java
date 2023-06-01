package it.unical.mat.ingsw.flyweight.soldier;

public class AxisSoldier implements Soldier {
    private final String TASK;
    private String weapon;

    public AxisSoldier() {
        TASK = "kill Allies' soldiers";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void doMission() {
        System.out.println("Axis soldier with WEAPON " + weapon + " | TASK: " + TASK);
    }
}
