package org.example;

public abstract class Warrior extends Character {
    private String weapon;
    private String power;

    public Warrior(String shortName, String weapon, String power) {
        super(shortName);
        this.weapon = weapon;
        this.power = power;
    }

    // WEAPON
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    // POWER
    public String getPower() {
        return power;
    }
    public void setPower (String power) {
        this.power = power;
    }
}
